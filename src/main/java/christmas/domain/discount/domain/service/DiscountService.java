package christmas.domain.discount.domain.service;

import christmas.domain.common.Money;
import christmas.domain.discount.domain.DiscountPolicy;
import christmas.domain.discount.domain.response.DiscountDto;
import christmas.domain.order.domain.response.OrderDto;
import java.util.List;

public class DiscountService {
    private final List<DiscountPolicy> discountPolicies;

    public DiscountService(List<DiscountPolicy> discountPolicies) {
        this.discountPolicies = discountPolicies;
    }

    public DiscountDto calculateDiscount(OrderDto orderDto) {
        Money totalDiscount = discountPolicies.stream()
                .map(policy -> policy.calculateDiscount(orderDto.getOrder()))
                .reduce(Money.ZERO, Money::add);
        return new DiscountDto(totalDiscount);
    }
}
