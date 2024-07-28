package christmas.domain.gift.domain;

import christmas.domain.order.domain.MenuItem;
import christmas.domain.order.domain.Order;

public interface GiftPolicy {
    MenuItem selectGift(Order order);
}
