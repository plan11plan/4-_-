package christmas.domain.member.domain.service;

import christmas.domain.member.domain.Member;
import christmas.domain.member.domain.MemberId;
import christmas.domain.member.domain.MemberRepository;
import christmas.domain.member.domain.response.MemberDto;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberDto findOrCreateMember(Long memberId) {
        Member member = memberRepository.findById(memberId);
        if (member == null) {
            member = new Member(new MemberId(memberId));
            memberRepository.save(member);
        }
        return new MemberDto(member);
    }
}
