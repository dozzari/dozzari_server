package today.dozzari.server.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {

    @Id
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "price", nullable = false)
    private Integer price;

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public Item(
            Long id,
            String name,
            Integer stock
    ) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
}
