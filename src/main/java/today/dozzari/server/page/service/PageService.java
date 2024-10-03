package today.dozzari.server.page.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import today.dozzari.server.page.dto.res.PageResponse;

@Service
@RequiredArgsConstructor
public class PageService {

    public PageResponse getOrderPage(Long dozzariId) {
        return PageResponse.builder()
                .dozzariId(dozzariId)
                .name("dozzari")
                .price(10000)
                .categories(null)
                .build();
    }
}
