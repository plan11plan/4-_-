package christmas.domain.order.domain;

import christmas.domain.member.domain.MemberId;

public class Orderer {
    private final MemberId memberId;

    public Orderer(MemberId memberId) {
        this.memberId = memberId;
    }

    public MemberId getMemberId() {
        return memberId;
    }
}
