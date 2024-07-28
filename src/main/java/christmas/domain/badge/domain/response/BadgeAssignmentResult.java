package christmas.domain.badge.domain.response;

import christmas.domain.badge.domain.EventBadge;

public class BadgeAssignmentResult {
    private final EventBadge badge;

    public BadgeAssignmentResult(EventBadge badge) {
        this.badge = badge;
    }

    public EventBadge getBadge() {
        return badge;
    }

}
