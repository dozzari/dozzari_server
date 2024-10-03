package today.dozzari.server.order.entity;

import jakarta.persistence.*;
import lombok.Getter;
import today.dozzari.server.user.entity.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
public class Order {
    @Id
    private String id;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;

    @Column(name = "status")
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User userId;
}

enum OrderStatus {
    PENDING,
    ACCEPTED,
    REJECTED,
    USING,
    DONE,
    CANCELED,
}
