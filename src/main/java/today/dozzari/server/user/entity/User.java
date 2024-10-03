package today.dozzari.server.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import today.dozzari.server.order.entity.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
public class User {
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @OneToMany(mappedBy = "orders")
    @JoinColumn(name = "order_id")
    private List<Order> orders = new ArrayList<>();
}
