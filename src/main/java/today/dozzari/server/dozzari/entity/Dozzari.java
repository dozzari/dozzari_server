package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import today.dozzari.server.common.entity.Item;
import today.dozzari.server.order.entity.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dozzaris")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Dozzari {

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "image_url", length = 100)
    private String imageUrl;

    @OneToMany(mappedBy = "dozzari", fetch = FetchType.LAZY)
    private List<DozzariItem> dozzariItems = new ArrayList<>();

    public String getSetInfo() {
        return this.dozzariItems.stream()
                .map(DozzariItem::getItem)
                .map(Item::getName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }

    @OneToMany(mappedBy = "dozzari", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public Dozzari(
            String id,
            String name
    ) {
        this.id = id;
        this.name = name;
    }
}
