package today.dozzari.server.dozzari.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "dozzaris")
@Getter
public class Dozzari {

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;
}
