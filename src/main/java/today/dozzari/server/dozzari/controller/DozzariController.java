package today.dozzari.server.dozzari.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import today.dozzari.server.dozzari.service.DozzariService;
import today.dozzari.server.util.DateTimeUtil;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DozzariController {

    private final DateTimeUtil dateTimeUtil;
    private final DozzariService dozzariService;

    @GetMapping("/dozzaris")
    public ResponseEntity<?> getAvailableDozzaris(
            @RequestParam(value = "start") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime start,
            @RequestParam(value = "end") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime end
    ) {

        return ResponseEntity.ok(null);
    }
}
