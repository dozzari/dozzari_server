package today.dozzari.server.dozzari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.dozzari.entity.AvailableTime;

public interface AvailableTimeRepository extends JpaRepository<AvailableTime, Long> {
}
