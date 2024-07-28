package christmas.domain.member.domain.response;

import christmas.domain.member.domain.Member;
import christmas.domain.member.domain.MemberId;

public class MemberDto {
    private final MemberId id;

    public MemberDto(Member member) {
        this.id = member.getId();
    }

    public MemberId getId() {
        return id;
    }
}
