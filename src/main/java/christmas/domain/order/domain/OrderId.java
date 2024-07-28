package christmas.domain.order.domain;

import java.util.Objects;

public class OrderId {
    private final Long value;

    public Long getValue() {
        return value;
    }

    public OrderId(Long value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderId orderId = (OrderId) o;
        return Objects.equals(value, orderId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
