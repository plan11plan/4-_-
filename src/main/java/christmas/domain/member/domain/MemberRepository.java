package christmas.domain.member.domain;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
}
