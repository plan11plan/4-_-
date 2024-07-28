package christmas.domain.badge.domain;

import christmas.domain.member.domain.MemberId;

public interface EventBadgeRepository {
    void save(EventBadgeAssignment assignment);
    EventBadgeAssignment findLatestByMemberId(MemberId memberId);
}
