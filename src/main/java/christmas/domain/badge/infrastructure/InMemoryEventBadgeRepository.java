package christmas.domain.badge.infrastructure;

import christmas.domain.badge.domain.EventBadgeAssignment;
import christmas.domain.badge.domain.EventBadgeRepository;
import christmas.domain.member.domain.MemberId;
import java.util.HashMap;
import java.util.Map;

public class InMemoryEventBadgeRepository implements EventBadgeRepository {
    private final Map<MemberId, EventBadgeAssignment> store = new HashMap<>();

    @Override
    public void save(EventBadgeAssignment assignment) {
        store.put(assignment.getMemberId(), assignment);
    }

    @Override
    public EventBadgeAssignment findLatestByMemberId(MemberId memberId) {
        return store.get(memberId);
    }
}
