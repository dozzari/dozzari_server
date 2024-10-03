package today.dozzari.server.dozzari.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import today.dozzari.server.dozzari.repository.AvailableDateRepository;
import today.dozzari.server.dozzari.repository.AvailableTimeRepository;

@Service
@RequiredArgsConstructor
public class AvailableDateTimeService {

    private final AvailableDateRepository availableDateRepository;
    private final AvailableTimeRepository availableTimeRepository;


}
