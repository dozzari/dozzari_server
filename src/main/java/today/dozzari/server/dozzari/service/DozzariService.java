package today.dozzari.server.dozzari.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import today.dozzari.server.dozzari.dto.res.AvailableDozzariResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DozzariService {

    private final AvailableDateTimeService availableDateTimeService;

    public List<AvailableDozzariResponse> getAllAvailableDozzaris(LocalDateTime start, LocalDateTime end) {
        LocalDate startDate = start.toLocalDate();
        LocalDate endDate = end.toLocalDate();

        return new ArrayList<>();
    }
}
