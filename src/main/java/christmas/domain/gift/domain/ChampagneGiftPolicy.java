package christmas.domain.gift.domain;

import christmas.domain.common.Money;
import christmas.domain.menu.MenuCategory;
import christmas.domain.order.domain.MenuItem;
import christmas.domain.order.domain.Order;

public class ChampagneGiftPolicy implements GiftPolicy {
    private static final Money GIFT_THRESHOLD = Money.wons(120000);
    private static final MenuItem CHAMPAGNE = new MenuItem("샴페인", Money.wons(25000), MenuCategory.BEVERAGE);
    @Override
    public MenuItem selectGift(Order order) {
        if (order.calculateTotalAmount().isGreaterThanOrEqual(GIFT_THRESHOLD)) {
            return CHAMPAGNE;
        }
        return null;
    }
}
