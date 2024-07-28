package christmas.presentation.response;

import christmas.domain.badge.domain.EventBadge;
import christmas.domain.common.Money;
import christmas.facade.response.OrderProcessingResponse;

public class OrderResultResponse {
    private final Money totalAmount;
    private final Money totalDiscount;
    private final String gift;
    private final Money totalBenefit;
    private final EventBadge eventBadge;

    public OrderResultResponse(OrderProcessingResponse response) {
        this.totalAmount = response.getTotalAmount();
        this.totalDiscount = response.getTotalDiscount();
        this.gift = response.getGift() != null ? response.getGiftName() : "없음";
        this.totalBenefit = response.getTotalBenefit();
        this.eventBadge = response.getEventBadge();
    }

    // getters

    public Money getTotalAmount() {
        return totalAmount;
    }

    public Money getTotalDiscount() {
        return totalDiscount;
    }

    public String getGift() {
        return gift;
    }

    public Money getTotalBenefit() {
        return totalBenefit;
    }

    public EventBadge getEventBadge() {
        return eventBadge;
    }
}
