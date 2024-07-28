package christmas.domain.gift.domain.request;

import christmas.domain.order.domain.Order;

public class SelectGiftRequest {
    private final Order order;

    public SelectGiftRequest(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

}
