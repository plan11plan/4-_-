package christmas.domain.discount.domain;

import christmas.domain.common.Money;
import christmas.domain.order.domain.Order;

public interface DiscountPolicy {
    Money calculateDiscount(Order order);
}
