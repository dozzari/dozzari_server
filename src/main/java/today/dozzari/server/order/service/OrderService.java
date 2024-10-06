package today.dozzari.server.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;
import today.dozzari.server.order.dto.req.OrderRequest;
import today.dozzari.server.order.dto.res.OrderResponse;
import today.dozzari.server.order.entity.Order;
import today.dozzari.server.order.entity.OrderItem;
import today.dozzari.server.order.repository.OrderRepository;
import today.dozzari.server.user.entity.User;
import today.dozzari.server.user.repository.UserRepository;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    @Transactional
    public List<OrderResponse> showOrder(String userId, LocalDateTime start, LocalDateTime end) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_USER));

        List<Order> orders = user.getOrders();
        if (start == null || end == null) {
            return orders.stream()
                    .map(order -> OrderResponse.builder()
                            .picnicSetName(order.getDozzari().getName())
                            .startAt(order.getStartAt())
                            .endAt(order.getEndAt())
                            .items(order.getOrderItems().stream().map(OrderItem::getItem).toList())
                            .price(
                                    ((order.getEndAt().getHour() - order.getStartAt().getHour() - 2) * 3000) + 5000
                            )
                            .location(order.getLocation())
                            .build())
                    .collect(Collectors.toList());
        }
        return orders.stream()
                .filter(order -> !order.getStartAt().isBefore(start) && !order.getEndAt().isAfter(end))
                .map(order -> OrderResponse.builder()
                        .picnicSetName(order.getDozzari().getName())
                        .startAt(order.getStartAt())
                        .endAt(order.getEndAt())
                        .items(order.getOrderItems().stream().map(OrderItem::getItem).toList())
                        .price(
                                ((order.getEndAt().getHour() - order.getStartAt().getHour() - 2) * 3000) + 5000
                        )
                        .location(order.getLocation())
                        .build())
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public OrderResponse showOrderByOrderId(String userId, String orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_ORDER));


        return OrderResponse.builder()
                .picnicSetName(order.getDozzari().getName())
                .startAt(order.getStartAt())
                .endAt(order.getEndAt())
                .items(order.getOrderItems().stream().map(OrderItem::getItem).toList())
                .price(
                        ((order.getEndAt().getHour() - order.getStartAt().getHour() - 2) * 3000) + 5000
                )
                .location(order.getLocation())
                .build();
    }

    @Transactional
    public void postOrder(String userId, OrderRequest request) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_USER));

        orderRepository.save(Order.builder()
                .id(generateOrderId())
                .user(user)
                .startAt(request.startAt())
                .endAt(request.endAt())
                .location(request.location()) //Enum 타입으로 들어오는건데 어떻게 해결할지 잘 모르겠어요.
                .dozzari(request.dozzari()) //만들어질때 기본적으로 ACCEPTED 값을 넣도록 설정했어요.
                .build()
        );
    }

    @Transactional
    public void deleteOrder(String userId, String orderId) {
        Order order = orderRepository.findByIdAndUserId(orderId, userId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_ORDER));
        orderRepository.delete(order);
    }

    private String generateOrderId() {
        String uuid = UUID.randomUUID().toString();
        byte[] uuidBytes = uuid.getBytes();
        byte[] userIdBytes;

        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            userIdBytes = sha256.digest(uuidBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Order Id 생성 중에 에러가 발생했습니다.");
        }

        StringBuilder orderId = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            orderId.append(String.format("%02x", userIdBytes[i]));
        }

        return orderId.toString();
    }
}