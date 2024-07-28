package christmas.domain.order.domain.request;

import christmas.domain.order.domain.MenuItem;
import java.time.LocalDate;
import java.util.List;

public class OrderInfo {
    private final LocalDate visitDate;
    private final List<MenuItem> menuItems;

    public OrderInfo(LocalDate visitDate, List<MenuItem> menuItems) {
        this.visitDate = visitDate;
        this.menuItems = menuItems;
    }
    public static OrderInfo of(LocalDate visitDate, List<MenuItem> menuItems) {
        return new OrderInfo(visitDate,menuItems);
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
