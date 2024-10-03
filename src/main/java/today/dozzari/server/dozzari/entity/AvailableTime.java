package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalTime;

@Entity
@Table(name = "available_times")
@Getter
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
}
