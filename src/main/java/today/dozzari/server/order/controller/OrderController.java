package today.dozzari.server.order.controller;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import today.dozzari.server.global.interceptor.annotation.UserId;
import today.dozzari.server.order.dto.req.OrderRequest;
import today.dozzari.server.order.dto.res.OrderResponse;
import today.dozzari.server.order.service.OrderService;

import java.net.URI;
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

    @PostMapping("/api/orders") //Request에서 OrderItem을 가져와야함.
    public ResponseEntity<?> postOrder(
            @Parameter(hidden = true) @UserId String userId,
            @RequestBody OrderRequest request
    ) {
        return ResponseEntity.created(URI.create("/api/orders/")).body(null);
    }

    @DeleteMapping("/api/orders/{orderId}")
    public ResponseEntity<?> deleteOrder(
            @Parameter(hidden = true) @UserId String userId,
            @PathVariable String orderId
    ) {
        orderService.deleteOrder(userId, orderId);
        return ResponseEntity.ok(null);
    }
}
