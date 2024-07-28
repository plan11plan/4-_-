package christmas.presentation.view;

import christmas.presentation.response.OrderResultResponse;

public class OutputView {
    public void printOrderResult(OrderResultResponse orderResult) {
        System.out.println("주문 결과:");
        System.out.println("총 주문 금액: " + orderResult.getTotalAmount().getAmount() + "원");
        System.out.println("총 할인 금액: " + orderResult.getTotalDiscount().getAmount() + "원");
        System.out.println("증정 메뉴: " + orderResult.getGift());
        System.out.println("총 혜택 금액: " + orderResult.getTotalBenefit().getAmount() + "원");
        System.out.println("할인 후 결제 금액: " + (orderResult.getTotalAmount().getAmount() - orderResult.getTotalDiscount().getAmount()) + "원");
        System.out.println("회원님의 12월 이벤트 배지: " + orderResult.getEventBadge());
    }

    public void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
