package today.dozzari.server.order.orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.order.entity.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
}
