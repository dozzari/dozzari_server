package today.dozzari.server.page.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import today.dozzari.server.page.dto.res.PageResponse;
import today.dozzari.server.page.service.PageService;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class PageController {

    private final PageService pageService;

    @GetMapping("/api/pages/orders/{dozzariId}")
    public ResponseEntity<PageResponse> getOrderPage(
            @PathVariable String dozzariId,
            @RequestParam(value = "start") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime start,
            @RequestParam(value = "end") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime end
    ) {
        PageResponse response = pageService.getOrderPage(dozzariId, start, end);

        return ResponseEntity.ok(response);
    }
}
