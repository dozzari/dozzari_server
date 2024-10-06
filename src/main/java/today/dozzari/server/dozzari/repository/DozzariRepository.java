package today.dozzari.server.dozzari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.order.entity.Order;

import java.util.Optional;

public interface DozzariRepository extends JpaRepository<Dozzari, String> {
    Optional<Dozzari> findDozzariByOrders(Order order);
}
