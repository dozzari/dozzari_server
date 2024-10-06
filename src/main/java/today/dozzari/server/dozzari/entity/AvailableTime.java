package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name = "available_times")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AvailableTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dozzari_id")
    private Dozzari dozzari;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "date")
    private AvailableDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "is_booked")
    private Boolean isBooked;

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public AvailableTime(
            Dozzari dozzari,
            AvailableDate date,
            LocalTime time
    ) {
        this.dozzari = dozzari;
        this.date = date;
        this.time = time;
        this.isBooked = false;
    }
}
