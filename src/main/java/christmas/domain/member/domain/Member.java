package christmas.domain.member.domain;

public class Member {
    private final MemberId id;

    public Member(MemberId id) {
        this.id = id;
    }

    public MemberId getId() {
        return id;
    }
    public Long getIdValue(){return id.getValue();}
}
