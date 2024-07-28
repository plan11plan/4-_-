package christmas;

import christmas.domain.badge.domain.EventBadgeRepository;
import christmas.domain.badge.domain.service.BadgeService;
import christmas.domain.badge.infrastructure.InMemoryEventBadgeRepository;
import christmas.domain.discount.domain.ChristmasDiscountPolicy;
import christmas.domain.discount.domain.WeekdayDiscountPolicy;
import christmas.domain.discount.domain.WeekendDiscountPolicy;
import christmas.domain.discount.domain.service.DiscountService;
import christmas.domain.gift.domain.ChampagneGiftPolicy;
import christmas.domain.gift.domain.service.GiftService;
import christmas.domain.member.domain.MemberRepository;
import christmas.domain.member.domain.service.MemberService;
import christmas.domain.member.infrastructure.InMemoryMemberRepository;
import christmas.domain.menu.MenuService;
import christmas.domain.order.domain.OrderIdGenerator;
import christmas.domain.order.domain.OrderRepository;
import christmas.domain.order.domain.service.OrderService;
import christmas.domain.order.infrastructure.AutoOrderIdGenerator;
import christmas.domain.order.infrastructure.InMemoryOrderRepository;
import christmas.facade.OrderFacade;
import christmas.presentation.OrderController;
import christmas.presentation.infrastructure.AutoMemberIdGenerator;
import christmas.presentation.request.CreateOrderRequest;
import christmas.presentation.response.OrderResultResponse;
import christmas.presentation.view.InputView;
import christmas.presentation.view.OutputView;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // Repositories
        OrderRepository orderRepository = new InMemoryOrderRepository();
        MemberRepository memberRepository = new InMemoryMemberRepository();
        EventBadgeRepository eventBadgeRepository = new InMemoryEventBadgeRepository();

        // Id Generator
        OrderIdGenerator orderIdGenerator = new AutoOrderIdGenerator(0);

        // Services
        OrderService orderService = new OrderService(orderRepository, orderIdGenerator);
        DiscountService discountService = new DiscountService(Arrays.asList(
                new ChristmasDiscountPolicy(),
                new WeekdayDiscountPolicy(),
                new WeekendDiscountPolicy()
        ));
        MenuService menuService = new MenuService();
        GiftService giftService = new GiftService(new ChampagneGiftPolicy());
        BadgeService badgeService = new BadgeService(eventBadgeRepository);
        MemberService memberService = new MemberService(memberRepository);

        // Facade
        OrderFacade orderFacade = new OrderFacade(orderService, discountService, giftService, badgeService, memberService,menuService);

        // Views
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        // Controller
        OrderController orderController = new OrderController(orderFacade);

        // Start the application
        CreateOrderRequest createOrderRequest = inputView.readOrderRequest(new AutoMemberIdGenerator(0L));
        OrderResultResponse orderResultResponse = orderController.processOrder(createOrderRequest);
        outputView.printOrderResult(orderResultResponse);
    }
}
