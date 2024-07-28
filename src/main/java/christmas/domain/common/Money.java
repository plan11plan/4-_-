package christmas.domain.common;

public class Money {
    public static final Money ZERO = new Money(0);
    private final int amount;

    private Money(int amount) {
        this.amount = amount;
    }

    public static Money wons(int amount) {
        return new Money(amount);
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money subtract(Money other) {
        return new Money(this.amount - other.amount);
    }

    public Money multiply(int multiplier) {
        return new Money(this.amount * multiplier);
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return this.amount >= other.amount;
    }

    public int getAmount() {
        return amount;
    }
}
