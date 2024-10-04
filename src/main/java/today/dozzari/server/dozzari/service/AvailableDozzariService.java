package today.dozzari.server.dozzari.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.dozzari.entity.AvailableDate;
import today.dozzari.server.dozzari.entity.AvailableTime;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.dozzari.repository.AvailableDateRepository;
import today.dozzari.server.dozzari.repository.AvailableTimeRepository;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AvailableDozzariService {

    private final AvailableDateRepository availableDateRepository;
    private final AvailableTimeRepository availableTimeRepository;


    @Transactional(readOnly = true)
    public List<AvailableTime> getAvailableTimesByDozzari(LocalDate date, Dozzari dozzari) {
        AvailableDate availableDate = availableDateRepository.findById(date)
                .orElseThrow(() -> new BusinessException(ExceptionCode.ILLEGAL_DATE));

        return availableTimeRepository.findAllByDateAndDozzariAndIsBookedOrderByTimeAsc(availableDate, dozzari, false);
    }
}
