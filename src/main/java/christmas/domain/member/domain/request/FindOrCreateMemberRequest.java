package christmas.domain.member.domain.request;

import christmas.domain.member.domain.MemberId;

public class FindOrCreateMemberRequest {
    private final MemberId memberId;

    public FindOrCreateMemberRequest(MemberId memberId) {
        this.memberId = memberId;
    }

    public MemberId getMemberId() {
        return memberId;
    }
}
