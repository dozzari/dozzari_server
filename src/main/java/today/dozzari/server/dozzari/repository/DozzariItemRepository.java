package today.dozzari.server.dozzari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.dozzari.entity.DozzariItem;

import java.util.List;

public interface DozzariItemRepository extends JpaRepository<DozzariItem, Long> {

    List<DozzariItem> findAllByDozzari_Id(String dozzariId);
}
