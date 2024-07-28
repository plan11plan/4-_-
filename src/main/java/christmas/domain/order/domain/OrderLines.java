package christmas.domain.order.domain;

import christmas.domain.common.Money;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderLines {
    private final List<OrderLine> orderLines;
    public OrderLines(){
        this.orderLines = new ArrayList<>();
    }

    public static OrderLines from(List<MenuItem> menuItems) {
        return null;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);

    }

    public Money calculateTotalAmount() {
        int sum = orderLines.stream()
                .mapToInt(orderLine -> orderLine.getAmount().getAmount())
                .sum();
        return Money.wons(sum);
    }
//    public Money calculateTotalAmount() {
//        return orderLines.stream()
//                .map(OrderLine::getAmount)
//                .reduce(Money.ZERO, Money::add);
//    }
public List<OrderLine> getOrderLines() {
    return Collections.unmodifiableList(orderLines);
}


}
