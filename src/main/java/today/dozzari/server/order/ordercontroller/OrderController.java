package today.dozzari.server.order.ordercontroller;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import today.dozzari.server.global.interceptor.annotation.UserId;
import today.dozzari.server.order.orderservice.OrderService;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/api/orders")
    public ResponseEntity<?> orderList (
            @Parameter(hidden = true) @UserId String userId,
            @RequestParam ?,
            @RequestParam?, ) {
        orderService.
    }
}
