package today.dozzari.server.order.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.order.domain.OrderPickUpLocation;
import today.dozzari.server.order.domain.OrderStatus;
import today.dozzari.server.user.entity.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor
public class Order {
    @Id
    private String id;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name = "location")
    @Enumerated(EnumType.STRING)
    private OrderPickUpLocation location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItems> orderItems = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dozzari_id")
    private Dozzari dozzari;

    @Builder
    public Order(String id, String userId, LocalDateTime startAt, LocalDateTime endAt, OrderPickUpLocation location, Dozzari dozzari) {
        status = OrderStatus.ACCEPTED;
    }
}
