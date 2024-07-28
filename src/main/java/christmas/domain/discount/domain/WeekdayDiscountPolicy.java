package christmas.domain.discount.domain;

import christmas.domain.common.Money;
import christmas.domain.menu.MenuCategory;
import christmas.domain.order.domain.Order;
import java.time.DayOfWeek;

public class WeekdayDiscountPolicy implements DiscountPolicy{
    private static final int DISCOUNT_AMOUNT = 2023;

    @Override
    public Money calculateDiscount(Order order) {
        if (isWeekend(order.getOrderDate().getDayOfWeek())) {
            return Money.ZERO;
        }
        long dessertCount = order.getOrderLines().getOrderLines().stream()
                .filter(line -> line.getMenuItem().getCategory() == MenuCategory.DESSERT)
                .mapToInt(line -> line.getQuantity())
                .sum();
        return Money.wons(DISCOUNT_AMOUNT * (int) dessertCount);
    }

    private boolean isWeekend(DayOfWeek dayOfWeek) {
        return dayOfWeek == DayOfWeek.FRIDAY || dayOfWeek == DayOfWeek.SATURDAY;
    }
}
