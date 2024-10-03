package today.dozzari.server.order.orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import today.dozzari.server.order.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
