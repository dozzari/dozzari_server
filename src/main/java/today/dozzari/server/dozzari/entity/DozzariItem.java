package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import today.dozzari.server.common.entity.Item;

@Entity
@Table(name = "dozzari_items")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public DozzariItem(
            Dozzari dozzari,
            Item item,
            Integer quantity
    ) {
        this.dozzari = dozzari;
        this.item = item;
        this.quantity = quantity;
    }
}
