package today.dozzari.server.order.orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.order.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
