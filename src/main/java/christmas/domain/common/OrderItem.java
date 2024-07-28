package christmas.domain.common;

import christmas.domain.order.domain.MenuItem;

public  class OrderItem {
    private final MenuItem menuItem;
    private final int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }
    public String getMenuItemName() {
        return menuItem.getName();
    }


    public int getQuantity() {
        return quantity;
    }
}
