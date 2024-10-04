package today.dozzari.server.dozzari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.dozzari.entity.AvailableDate;
import today.dozzari.server.dozzari.entity.AvailableTime;
import today.dozzari.server.dozzari.entity.Dozzari;

import java.time.LocalTime;
import java.util.List;

public interface AvailableTimeRepository extends JpaRepository<AvailableTime, Long> {

    List<AvailableTime> findAllByDateAndDozzariAndIsBookedOrderByTimeAsc(AvailableDate date, Dozzari dozzari, Boolean isBooked);

    List<AvailableTime> findAllByDateAndDozzariAndIsBookedAndTimeBetween(
            AvailableDate date, Dozzari dozzari, Boolean isBooked, LocalTime start, LocalTime end);
}
