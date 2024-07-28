package christmas.facade.request;

import christmas.presentation.view.UnCertifiedMenuItem;
import java.time.LocalDate;
import java.util.List;

public class ProcessOrderRequest {
    private final Long memberId;
    private final LocalDate orderDate;
    private final List<UnCertifiedMenuItem> unCertifiedMenuItems;

    public ProcessOrderRequest(Long memberId, LocalDate orderDate, List<UnCertifiedMenuItem> unCertifiedMenuItems) {
        this.memberId = memberId;
        this.orderDate = orderDate;
        this.unCertifiedMenuItems = unCertifiedMenuItems;
    }

    public static ProcessOrderRequest of(Long memberId,LocalDate orderDate, List<UnCertifiedMenuItem> unCertifiedMenuItems) {
       return new ProcessOrderRequest(memberId,orderDate, unCertifiedMenuItems);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<UnCertifiedMenuItem> getUnCertifiedMenuItems() {
        return unCertifiedMenuItems;
    }

    public Long getMemberId() {
        return memberId;
    }
}
