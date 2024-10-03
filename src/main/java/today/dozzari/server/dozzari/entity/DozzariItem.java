package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import today.dozzari.server.common.entity.Item;

@Entity
@Table(name = "dozzari_items")
@Getter
public class DozzariItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dozzari_id")
    private Dozzari dozzari;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "quantity")
    private Integer quantity;
}
