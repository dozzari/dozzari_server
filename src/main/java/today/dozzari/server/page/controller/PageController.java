package today.dozzari.server.page.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import today.dozzari.server.page.dto.res.PageResponse;
import today.dozzari.server.page.service.PageService;

@RestController
@RequiredArgsConstructor
public class PageController {

    private final PageService pageService;

    @GetMapping("/api/pages/order/{dozzariId}")
    public ResponseEntity<PageResponse> getOrderPage(
            @PathVariable Long dozzariId
    ) {
        PageResponse response = pageService.getOrderPage(dozzariId);

        return ResponseEntity.ok(response);
    }
}
