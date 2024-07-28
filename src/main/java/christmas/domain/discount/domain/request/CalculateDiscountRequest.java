package christmas.domain.discount.domain.request;

import christmas.domain.order.domain.Order;

public class CalculateDiscountRequest {
    private final Order order;

    public CalculateDiscountRequest(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
