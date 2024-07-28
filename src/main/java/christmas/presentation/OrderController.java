package christmas.presentation;


import christmas.facade.OrderFacade;
import christmas.facade.request.ProcessOrderRequest;
import christmas.presentation.request.CreateOrderRequest;
import christmas.presentation.response.OrderResultResponse;

public class OrderController {
    private final OrderFacade orderFacade;
    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    public OrderResultResponse processOrder(CreateOrderRequest request) {
        var processOrderRequest = ProcessOrderRequest.of(
                request.getMemberId(),
                request.getOrderDate(),
                request.getUnCertifiedMenuItems()
        );
        var orderProcessingResponse = orderFacade.processOrder(processOrderRequest);
        return new OrderResultResponse(orderProcessingResponse);
    }
}
