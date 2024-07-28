package christmas.domain.member.infrastructure;

import christmas.domain.member.domain.Member;
import christmas.domain.member.domain.MemberRepository;
import java.util.HashMap;
import java.util.Map;

public class InMemoryMemberRepository implements MemberRepository {
    private final Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getIdValue(), member);
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }
}
