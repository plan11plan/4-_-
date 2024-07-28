package christmas.domain.discount.domain;

import christmas.domain.common.Money;
import christmas.domain.order.domain.Order;
import java.time.LocalDate;

public class ChristmasDiscountPolicy implements DiscountPolicy{
    private static final LocalDate DISCOUNT_START_DATE = LocalDate.of(2023, 12, 1);
    private static final LocalDate DISCOUNT_END_DATE = LocalDate.of(2023, 12, 25);
    private static final int BASE_DISCOUNT = 1000;
    private static final int DAILY_INCREASE = 100;

    @Override
    public Money calculateDiscount(Order order) {
        LocalDate orderDate = order.getOrderDate();
        if (orderDate.isBefore(DISCOUNT_START_DATE) || orderDate.isAfter(DISCOUNT_END_DATE)) {
            return Money.ZERO;
        }
        int daysSinceStart = orderDate.getDayOfMonth() - DISCOUNT_START_DATE.getDayOfMonth();
        return Money.wons(BASE_DISCOUNT + (daysSinceStart * DAILY_INCREASE));
    }
}
