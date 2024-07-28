package christmas.domain.gift.domain.service;

import christmas.domain.gift.domain.GiftPolicy;
import christmas.domain.gift.domain.response.GiftDto;
import christmas.domain.order.domain.response.OrderDto;

public class GiftService {
    private final GiftPolicy giftPolicy;

    public GiftService(GiftPolicy giftPolicy) {
        this.giftPolicy = giftPolicy;
    }

    public GiftDto selectGift(OrderDto orderDto) {
        return new GiftDto(giftPolicy.selectGift(orderDto.getOrder()));
    }
}
