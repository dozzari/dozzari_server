package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "available_dates")
@Getter
public class AvailableDate {
    @Id
    private LocalDate date;

    @OneToMany(mappedBy = "date", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AvailableTime> availableTimes = new ArrayList<>();
}
