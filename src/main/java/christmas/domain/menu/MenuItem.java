package christmas.domain.menu;

import christmas.domain.common.Money;

public class MenuItem {
    private final MenuItemId id;
    private final String name;
    private final Money price;
    private final MenuCategory category;

    public MenuItem(MenuItemId id, String name, Money price, MenuCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public MenuItemId getId() {
        return id;
    }
    public Long getIdValue(){
        return id.getId();
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    public MenuCategory getCategory() {
        return category;
    }
}
