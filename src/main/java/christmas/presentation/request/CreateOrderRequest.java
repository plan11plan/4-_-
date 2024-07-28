package christmas.presentation.request;

import christmas.presentation.view.UnCertifiedMenuItem;
import java.time.LocalDate;
import java.util.List;

public class CreateOrderRequest {
    private final Long memberId;
    private final LocalDate orderDate;
    private final List<UnCertifiedMenuItem> unCertifiedMenuItems;
    public CreateOrderRequest(Long  memberId, LocalDate orderDate, List<UnCertifiedMenuItem> unCertifiedMenuItems) {
        this.memberId = memberId;
        this.orderDate = orderDate;
        this.unCertifiedMenuItems = unCertifiedMenuItems;
    }

    public Long  getMemberId() {
        return memberId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<UnCertifiedMenuItem> getUnCertifiedMenuItems() {
        return unCertifiedMenuItems;
    }
}
