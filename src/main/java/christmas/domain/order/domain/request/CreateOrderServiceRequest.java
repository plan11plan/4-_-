package christmas.domain.order.domain.request;

import christmas.domain.common.OrderItem;
import java.time.LocalDate;
import java.util.List;

public class CreateOrderServiceRequest {
    private final Long memberId;
    private final LocalDate orderDate;
    private final List<OrderItem> orderItems;
    public CreateOrderServiceRequest(Long memberId, LocalDate orderDate, List<OrderItem> orderItems) {
        this.memberId = memberId;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
    }


    public Long getMemberId() {
        return memberId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }


}
