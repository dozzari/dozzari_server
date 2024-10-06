package today.dozzari.server.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.dozzari.entity.AvailableTime;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.dozzari.repository.AvailableTimeRepository;
import today.dozzari.server.dozzari.repository.DozzariRepository;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;
import today.dozzari.server.order.dto.req.OrderRequest;
import today.dozzari.server.order.dto.res.OrderResponse;
import today.dozzari.server.order.entity.Order;
import today.dozzari.server.order.entity.OrderItem;
import today.dozzari.server.order.repository.OrderRepository;
import today.dozzari.server.user.entity.User;
import today.dozzari.server.user.repository.UserRepository;
import today.dozzari.server.util.StringUtil;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final StringUtil stringUtil;
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final DozzariRepository dozzariRepository;
    private final AvailableTimeRepository availableTimeRepository;

    @Transactional(readOnly = true)
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
        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, request.startAt());
        // 1시간 전에 주문 불가 로직
        if ((request.startAt().getYear() == now.getYear()
                && request.startAt().getMonth() == now.getMonth()
                && request.startAt().getDayOfMonth() == now.getDayOfMonth())
                && ((duration.toMinutes() <= 60 && duration.toMinutes() >= 0)))
            throw new BusinessException(ExceptionCode.ILLEGAL_ORDER);

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_USER));

        Dozzari dozzari = dozzariRepository.findById(request.dozzariId())
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_DOZZARI));

        // 예약 후 한 시간 후도 예약 불가하도록.
        List<AvailableTime> orderTime = availableTimeRepository.findAllByDozzariAndTimeBetween(
                dozzari,
                request.startAt().toLocalTime(),
                request.endAt().toLocalTime().plusMinutes(30)
        );
        // 중복 예약 불가 로직: 하나라도 true 값 -> 예약이 되어 있다면 예외 발생
        for (AvailableTime isBookedChange : orderTime) {
            if (isBookedChange.getIsBooked()) {
                throw new BusinessException(ExceptionCode.ILLEGAL_ORDER);
            }
        }
        // is_Booked 값을 false 에서 true 로 바꾸기
        for (AvailableTime isBookedChange : orderTime) {
            isBookedChange.changeBookStatus();
            availableTimeRepository.save(isBookedChange);
        }

        orderRepository.save(Order.builder()
                .id(stringUtil.generateRandomId())
                .user(user)
                .startAt(request.startAt())
                .endAt(request.endAt())
                .location(request.location())
                .dozzari(dozzari)
                .build()
        );
    }

    @Transactional
    public void deleteOrder(String userId, String orderId) {
        Order order = orderRepository.findByIdAndUserId(orderId, userId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_ORDER));

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, order.getStartAt());
        // 주문 번호 바탕으로 돗자리 객체 찾기
        Dozzari dozzari = dozzariRepository.findDozzariByOrders(order)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_DOZZARI));

        // 1시간 전에 취소 불가 로직
        if ((order.getStartAt().getYear() == now.getYear()
                && order.getStartAt().getMonth() == now.getMonth()
                && order.getStartAt().getDayOfMonth() == now.getDayOfMonth())
                && ((duration.toMinutes() <= 60 && duration.toMinutes() >= 0)))
            throw new BusinessException(ExceptionCode.ILLEGAL_DELETE);
        // 돗자리 아이디와 가져온 주문 바탕으로 AvailableTime 값들 리스트로 받아오기
        List<AvailableTime> orderTime = availableTimeRepository.findAllByDozzariAndTimeBetween(
                dozzari,
                order.getStartAt().toLocalTime(),
                order.getEndAt().toLocalTime().plusMinutes(30)
        );
        // is_Booked 값들 true 에서 false 로 바꾸기
        for (AvailableTime isBookedChange : orderTime) {
            isBookedChange.changeBookStatus();
            availableTimeRepository.save(isBookedChange);
        }

        orderRepository.delete(order);
    }
}