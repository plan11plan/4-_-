package christmas.domain.badge.domain;

import christmas.domain.member.domain.MemberId;
import java.time.LocalDate;

public class EventBadgeAssignment {
    private final MemberId memberId;
    private final EventBadge badge;
    private final LocalDate assignmentDate;

    public EventBadgeAssignment(MemberId memberId, EventBadge badge, LocalDate assignmentDate) {
        this.memberId = memberId;
        this.badge = badge;
        this.assignmentDate = assignmentDate;
    }

    public MemberId getMemberId() {
        return memberId;
    }

    public EventBadge getBadge() {
        return badge;
    }

    public LocalDate getAssignmentDate() {
        return assignmentDate;
    }
}
