package today.dozzari.server.dozzari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.dozzari.entity.Dozzari;

public interface DozzariRepository extends JpaRepository<Dozzari, String> {
}
