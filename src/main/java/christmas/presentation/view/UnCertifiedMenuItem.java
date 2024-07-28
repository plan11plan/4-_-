package christmas.presentation.view;

public class UnCertifiedMenuItem {
    private final String menuItemName;
    private final int quantity;

    public UnCertifiedMenuItem(String menuItemName, int quantity) {
        this.menuItemName = menuItemName;
        this.quantity = quantity;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public int getQuantity() {
        return quantity;
    }
}
