package christmas.facade;

import christmas.domain.badge.domain.service.BadgeService;
import christmas.domain.discount.domain.service.DiscountService;
import christmas.domain.gift.domain.service.GiftService;
import christmas.domain.member.domain.service.MemberService;
import christmas.domain.menu.MenuService;
import christmas.domain.order.domain.request.OrderInfo;
import christmas.domain.order.domain.service.OrderService;
import christmas.facade.request.ProcessOrderRequest;
import christmas.facade.response.OrderProcessingResponse;

public class OrderFacade {

    private final OrderService orderService;
    private final DiscountService discountService;
    private final GiftService giftService;
    private final BadgeService badgeService;
    private final MemberService memberService;
    private final MenuService menuService;

    public OrderFacade(OrderService orderService, DiscountService discountService, GiftService giftService,
                       BadgeService badgeService, MemberService memberService, MenuService menuService) {
        this.orderService = orderService;
        this.discountService = discountService;
        this.giftService = giftService;
        this.badgeService = badgeService;
        this.memberService = memberService;
        this.menuService = menuService;
    }

    public OrderProcessingResponse processOrder(ProcessOrderRequest request) {
        var memberDto = memberService.findOrCreateMember(request.getMemberId());
        var menuDto = menuService.certify(request.getUnCertifiedMenuItems());

        var orderDto = orderService.createOrder(memberDto, OrderInfo.of(request.getOrderDate(),menuDto.getMenuItems()));
        var discountDto = discountService.calculateDiscount(orderDto);
        var giftDto = giftService.selectGift(orderDto);
        var badgeDto = badgeService.assignBadge(memberDto, discountDto.getTotalDiscount().add(giftDto.getGiftValue()));

        return new OrderProcessingResponse(
                orderDto.getTotalAmount(),
                discountDto.getTotalDiscount(),
                giftDto,
                badgeDto.getBadge());
    }

}
