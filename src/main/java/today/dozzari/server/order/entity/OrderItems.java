package today.dozzari.server.order.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "quantity")
    private Integer quantity;

}