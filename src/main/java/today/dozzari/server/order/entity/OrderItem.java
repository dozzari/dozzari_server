package today.dozzari.server.order.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import today.dozzari.server.common.entity.Item;

@Entity
@Table(name = "order_items")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "quantity")
    private Integer quantity;

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public OrderItem(
            Order order,
            Item item,
            Integer quantity
    ) {
        this.order = order;
        this.item = item;
        this.quantity = quantity;
    }
}