package christmas.domain.menu;

import java.util.List;

public class MenuDto {
   private final List<MenuItem> menuItems;


    public MenuDto(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<christmas.domain.order.domain.MenuItem> getMenuItems() {
        return menuItems;
    }
}
