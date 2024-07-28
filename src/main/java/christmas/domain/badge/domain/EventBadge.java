package christmas.domain.badge.domain;

import christmas.domain.common.Money;

public enum EventBadge {
    NONE, STAR, TREE, SANTA;

    public static EventBadge fromBenefitAmount(Money benefitAmount) {
        if (benefitAmount.isGreaterThanOrEqual(Money.wons(20000))) {
            return SANTA;
        }
        if (benefitAmount.isGreaterThanOrEqual(Money.wons(10000))) {
            return TREE;
        }
        if (benefitAmount.isGreaterThanOrEqual(Money.wons(5000))) {
            return STAR;
        }
        return NONE;
    }
}