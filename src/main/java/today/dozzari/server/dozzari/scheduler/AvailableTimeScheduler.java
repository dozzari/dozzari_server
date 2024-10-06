package today.dozzari.server.dozzari.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import today.dozzari.server.dozzari.entity.AvailableDate;
import today.dozzari.server.dozzari.entity.AvailableTime;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.dozzari.repository.AvailableDateRepository;
import today.dozzari.server.dozzari.repository.AvailableTimeRepository;
import today.dozzari.server.dozzari.repository.DozzariRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class AvailableTimeScheduler {

    private final DozzariRepository dozzariRepository;
    private final AvailableDateRepository availableDateRepository;
    private final AvailableTimeRepository availableTimeRepository;

    @Scheduled(cron = "0 0 0 * * *")
    public void testScheduler() {
        // 1. Available Date -> 어제 날짜 삭제
        var yesterday = LocalDate.now().minusDays(1);
        availableDateRepository.deleteById(yesterday);

        // 2. Available Date + 6일 -> 6일 후 날짜 추가
        var nextWeek = LocalDate.now().plusDays(6);
        AvailableDate availableDate = AvailableDate.builder()
                .date(nextWeek)
                .build();

        availableDate = availableDateRepository.save(availableDate);

        // 3. Available time -> 7일 후 날짜에 대한 시간 추가
        // 10:00, 10:30, 11:00, 11:30, 12:00, 12:30, 13:00, 13:30, 14:00, 14:30, 15:00, 15:30, 16:00, 16:30, 17:00, 17:30, 18:00, 18:30, 19:00, 19:30, 20:00, 20:30, 21:00, 21:30
        List<Dozzari> dozzaris = dozzariRepository.findAll();
        for (var dozzari : dozzaris) {
            for (int i = 0; i < 24; i++) {
                LocalTime time = LocalTime.of(10, 0).plusMinutes(30 * i);
                AvailableTime availableTime = AvailableTime.builder()
                        .date(availableDate)
                        .time(time)
                        .dozzari(dozzari)
                        .build();

                availableTimeRepository.save(availableTime);
            }
        }
    }
}
