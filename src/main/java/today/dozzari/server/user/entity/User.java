package today.dozzari.server.user.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import today.dozzari.server.auth.domain.Provider;
import today.dozzari.server.order.entity.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {
    @Id
    private String id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "provider", nullable = false)
    @Enumerated(EnumType.STRING)
    private Provider provider;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public User(
            String id,
            String email,
            Provider provider
    ) {
        this.id = id;
        this.email = email;
        this.provider = provider;
    }
}
