package christmas.domain.order.domain.service;

import christmas.domain.member.domain.response.MemberDto;
import christmas.domain.order.domain.Order;
import christmas.domain.order.domain.OrderDate;
import christmas.domain.order.domain.OrderId;
import christmas.domain.order.domain.OrderIdGenerator;
import christmas.domain.order.domain.OrderLines;
import christmas.domain.order.domain.OrderRepository;
import christmas.domain.order.domain.Orderer;
import christmas.domain.order.domain.request.OrderInfo;
import christmas.domain.order.domain.response.OrderDto;

public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderIdGenerator orderIdGenerator;

    public OrderService(OrderRepository orderRepository, OrderIdGenerator orderIdGenerator) {
        this.orderRepository = orderRepository;
        this.orderIdGenerator = orderIdGenerator;
    }

    public OrderDto createOrder(MemberDto member, OrderInfo orderInfo) {
        OrderId orderId = new OrderId(orderIdGenerator.getNextId());
        Orderer orderer = new Orderer(member.getId());
        OrderDate orderDate = new OrderDate(orderInfo.getVisitDate());
        OrderLines orderLines = OrderLines.from(orderInfo.getMenuItems());

        Order order = new Order(orderId,orderer,orderDate,orderLines);
        orderRepository.save(order);
        return new OrderDto(order);
    }
}
