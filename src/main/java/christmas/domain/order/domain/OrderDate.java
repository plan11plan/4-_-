package christmas.domain.order.domain;

import java.time.LocalDate;

public class OrderDate {
    private final LocalDate orderDate;

    public OrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
