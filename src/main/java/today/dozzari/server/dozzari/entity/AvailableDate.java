package today.dozzari.server.dozzari.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "available_dates")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AvailableDate {
    @Id
    private LocalDate date;

    @OneToMany(mappedBy = "date", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AvailableTime> availableTimes = new ArrayList<>();

    /* --------------------------------- */
    /* ----------- Functions ----------- */
    /* --------------------------------- */
    @Builder
    public AvailableDate(
            LocalDate date
    ) {
        this.date = date;
    }
}
