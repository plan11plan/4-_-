package christmas.domain.order.domain.response;

import christmas.domain.common.Money;
import christmas.domain.order.domain.Order;
import christmas.domain.order.domain.OrderLines;

public class OrderDto {
    private final Money totalAmount;
    private final OrderLines orderLines;

    public OrderDto(Order order) {
        this.totalAmount = order.getTotalAmounts();
        this.orderLines = order.getOrderLines();
    }


    public Money getTotalAmount() {
        return totalAmount;
    }

    public OrderLines getOrderLines() {
        return orderLines;
    }
}
