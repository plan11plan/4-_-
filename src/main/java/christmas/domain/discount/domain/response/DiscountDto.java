package christmas.domain.discount.domain.response;

import christmas.domain.common.Money;

public class DiscountDto {
    private final Money totalDiscount;

    public DiscountDto(Money totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Money getTotalDiscount() {
        return totalDiscount;
    }
}
