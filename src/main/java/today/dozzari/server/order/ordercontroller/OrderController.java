package today.dozzari.server.order.ordercontroller;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import today.dozzari.server.global.interceptor.annotation.UserId;
import today.dozzari.server.order.dto.res.OrderResponse;
import today.dozzari.server.order.orderservice.OrderService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/api/orders")
    public ResponseEntity<List<OrderResponse>> orderList(
            @Parameter(hidden = true) @UserId String userId,
            @RequestParam(value = "start") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime start,
            @RequestParam(value = "end") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime end) {
        var response = orderService.showOrder(userId, start, end);
        return ResponseEntity.ok(response);

    }

    @GetMapping("/api/orders/{orderId}")
    public ResponseEntity<OrderResponse> orderIdList(
            @Parameter(hidden = true) @UserId String userId,
            @PathVariable String orderId) {
        var response = orderService.showOrderByOrderId(userId, orderId);
        return ResponseEntity.ok(response);
    }
}
