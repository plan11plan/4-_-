package christmas.domain.order.domain;

import christmas.domain.common.Money;

public class OrderLine {
    private final MenuItem menuItem;
    private final int quantity;

    public OrderLine(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }
    public Money getAmount(){
        return menuItem.getPrice().multiply(quantity);
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
