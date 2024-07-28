package christmas.domain.badge.domain.request;

import christmas.domain.common.Money;
import christmas.domain.member.domain.MemberId;

public class AssignBadgeRequest {
    private final MemberId memberId;
    private final Money totalBenefit;

    public AssignBadgeRequest(MemberId memberId, Money totalBenefit) {
        this.memberId = memberId;
        this.totalBenefit = totalBenefit;
    }

    public MemberId getMemberId() {
        return memberId;
    }

    public Money getTotalBenefit() {
        return totalBenefit;
    }
}
