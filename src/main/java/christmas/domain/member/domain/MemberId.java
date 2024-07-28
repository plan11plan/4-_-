package christmas.domain.member.domain;

import java.util.Objects;

public class MemberId {
    private final Long value;

    public MemberId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberId memberId = (MemberId) o;
        return Objects.equals(value, memberId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
