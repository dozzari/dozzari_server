package today.dozzari.server.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import today.dozzari.server.common.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
