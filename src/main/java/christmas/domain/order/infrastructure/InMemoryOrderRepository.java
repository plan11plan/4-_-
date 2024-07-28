package christmas.domain.order.infrastructure;

import christmas.domain.order.domain.Order;
import christmas.domain.order.domain.OrderId;
import christmas.domain.order.domain.OrderRepository;
import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {
    private final Map<OrderId, Order> repository  = new HashMap<>();
    @Override
    public void save(Order order) {
        repository.put(order.getId(),order);

    }

    @Override
    public Order findById(OrderId id) {
        return repository.get(id);
    }
}
