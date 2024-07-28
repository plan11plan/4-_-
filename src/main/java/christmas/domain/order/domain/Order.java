package christmas.domain.order.domain;

import christmas.domain.common.Money;
import java.time.LocalDate;

public class Order {
    private final OrderId id;
    private final Orderer orderer;
    private final OrderLines orderLines;
    private final Money totalAmounts;
    private final OrderDate orderDate;

    public Order(OrderId id, Orderer orderer, OrderDate orderDate,OrderLines orderLines) {
        this.id = id;
        this.orderer = orderer;
        this.orderLines = orderLines;
        this.orderDate = orderDate;
        this.totalAmounts = calculateTotalAmount();
    }

    public void addOrderLine(MenuItem menuItem, int quantity) {
        orderLines.addOrderLine(new OrderLine(menuItem, quantity));
    }

    private Money calculateTotalAmount() {
        return orderLines.calculateTotalAmount();
    }

    public OrderId getId() {
        return id;
    }

    public Orderer getOrderer() {
        return orderer;
    }

    public Long getOrdererValue() {
        return orderer.getMemberId().getValue();
    }

    public OrderLines getOrderLines() {
        return orderLines;
    }

    public LocalDate getOrderDateValue() {
        return orderDate.getOrderDate();
    }

    public Money getTotalAmounts() {
        return totalAmounts;
    }

    public OrderDate getOrderDate() {
        return orderDate;
    }
}
