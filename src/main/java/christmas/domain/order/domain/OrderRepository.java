package christmas.domain.order.domain;

public interface OrderRepository {
    void save(Order order);
    Order findById(OrderId id);
}
