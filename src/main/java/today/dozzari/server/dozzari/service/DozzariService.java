package today.dozzari.server.dozzari.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.dozzari.dto.res.AvailableDozzariResponse;
import today.dozzari.server.dozzari.entity.AvailableTime;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.dozzari.repository.DozzariRepository;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DozzariService {

    private final AvailableDozzariService availableDozzariService;
    private final DozzariRepository dozzariRepository;

    @Transactional(readOnly = true)
    public List<AvailableDozzariResponse> getAllAvailableDozzaris(LocalDateTime start, LocalDateTime end) {
        if (isDifferentDate(start, end)) {
            throw new BusinessException(ExceptionCode.ILLEGAL_DATE);
        }

        List<Dozzari> dozzaris = dozzariRepository.findAll();

        List<AvailableDozzariResponse> responses = new ArrayList<>();

        dozzaris.forEach(dozzari -> {
            List<AvailableTime> availableTimes = availableDozzariService.getAvailableTimesByDozzari(start.toLocalDate(), dozzari);
            List<LocalTime> times = availableTimes.stream().map(AvailableTime::getTime).toList();
            if (isContinuousTime(times, start.toLocalTime(), end.toLocalTime())) {
                responses.add(AvailableDozzariResponse.builder()
                        .dozzariId(dozzari.getId())
                        .dozzariImageUrl(dozzari.getImageUrl())
                        .setInfo(dozzari.getSetInfo())
                        .availableTimes(formatTimeRanges(times))
                        .build());
            }
        });

        return responses;
    }

    private Boolean isContinuousTime(List<LocalTime> availableTimes, LocalTime start, LocalTime end) {
        if (start.isAfter(end)) {
            return false;
        }

        List<LocalTime> filteredTimes = availableTimes.stream()
                .filter(time -> !time.isBefore(start) && !time.isAfter(end))
                .sorted()
                .toList();

        LocalTime currentTime = start;
        for (var time : filteredTimes) {
            if (!time.equals(currentTime)) {
                return false;
            }

            currentTime = currentTime.plusMinutes(30);
        }

        return currentTime.equals(end.plusMinutes(30));
    }

    private Boolean isDifferentDate(LocalDateTime start, LocalDateTime end) {
        return !start.toLocalDate().isEqual(end.toLocalDate());
    }

    private String formatTimeRanges(List<LocalTime> times) {
        if (times == null || times.isEmpty()) {
            return "";
        }

        List<String> ranges = new ArrayList<>();
        LocalTime startTime = times.get(0);
        LocalTime prevTime = startTime;

        for (int i = 1; i < times.size(); i++) {
            LocalTime currentTime = times.get(i);
            if (!currentTime.equals(prevTime.plusMinutes(30))) {
                ranges.add(formatRange(startTime, prevTime));
                startTime = currentTime;
            }
            prevTime = currentTime;
        }

        ranges.add(formatRange(startTime, prevTime));

        return String.join(", ", ranges);
    }

    private String formatRange(LocalTime start, LocalTime end) {
        if (start.equals(end)) {
            return start.toString();
        }

        return start.toString() + " ~ " + end.toString();
    }
}
