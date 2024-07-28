package christmas.facade.response;

import christmas.domain.badge.domain.EventBadge;
import christmas.domain.common.Money;
import christmas.domain.gift.domain.response.GiftDto;

public class OrderProcessingResponse {
    private final Money totalAmount;
    private final Money totalDiscount;
    private final GiftDto gift;
    private final Money totalBenefit;
    private final EventBadge eventBadge;

    public OrderProcessingResponse(Money totalAmount, Money totalDiscount, GiftDto gift, EventBadge eventBadge) {
        this.totalAmount = totalAmount;
        this.totalDiscount = totalDiscount;
        this.gift = gift;
        this.totalBenefit = totalDiscount.add(gift.getGiftValue());
        this.eventBadge = eventBadge;
    }

    public Money getTotalAmount() {
        return totalAmount;
    }

    public Money getTotalDiscount() {
        return totalDiscount;
    }

    public GiftDto getGift() {
        return gift;
    }
    public String getGiftName(){
        return gift.getGift().getName();
    }

    public Money getTotalBenefit() {
        return totalBenefit;
    }

    public EventBadge getEventBadge() {
        return eventBadge;
    }
}
