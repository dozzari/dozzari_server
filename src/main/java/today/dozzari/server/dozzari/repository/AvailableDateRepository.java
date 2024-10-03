package today.dozzari.server.dozzari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.dozzari.entity.AvailableDate;

import java.time.LocalDate;

public interface AvailableDateRepository extends JpaRepository<AvailableDate, LocalDate> {
}
