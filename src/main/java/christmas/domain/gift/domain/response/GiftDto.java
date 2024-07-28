package christmas.domain.gift.domain.response;

import christmas.domain.common.Money;
import christmas.domain.order.domain.MenuItem;

public class GiftDto {
    private final MenuItem gift;

    public GiftDto(MenuItem gift) {
        this.gift = gift;
    }

    public MenuItem getGift() {
        return gift;
    }

    public Money getGiftValue() {
        return gift != null ? gift.getPrice() : Money.ZERO;
    }
}
