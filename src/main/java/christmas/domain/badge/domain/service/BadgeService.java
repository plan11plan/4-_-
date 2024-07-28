package christmas.domain.badge.domain.service;

import christmas.domain.badge.domain.EventBadge;
import christmas.domain.badge.domain.EventBadgeAssignment;
import christmas.domain.badge.domain.EventBadgeRepository;
import christmas.domain.badge.domain.response.BadgeAssignmentResult;
import christmas.domain.common.Money;
import christmas.domain.member.domain.response.MemberDto;
import java.time.LocalDate;

public class BadgeService {
    private final EventBadgeRepository eventBadgeRepository;
    public BadgeService(EventBadgeRepository eventBadgeRepository) {
        this.eventBadgeRepository = eventBadgeRepository;
    }

    public BadgeAssignmentResult assignBadge(MemberDto memberDto, Money totalBenefit) {
        EventBadge newBadge = EventBadge.fromBenefitAmount(totalBenefit);
        EventBadgeAssignment assignment = new EventBadgeAssignment(memberDto.getId(), newBadge, LocalDate.now());
        eventBadgeRepository.save(assignment);
        return new BadgeAssignmentResult(newBadge);
    }


}
