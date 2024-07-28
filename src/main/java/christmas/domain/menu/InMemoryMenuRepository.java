package christmas.domain.menu;

import christmas.domain.common.Money;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryMenuRepository implements  MenuRepository{
    private final Map<String, MenuItem> menuItems;

    public InMemoryMenuRepository() {
        this.menuItems = initializeMenuItems();
    }

    private Map<String, MenuItem> initializeMenuItems() {
        return List.of(
                new MenuItem("양송이수프", Money.wons(6000), MenuCategory.APPETIZER),
                new MenuItem("타파스", Money.wons(5500), MenuCategory.APPETIZER),
                new MenuItem("시저샐러드", Money.wons(8000), MenuCategory.APPETIZER),
                new MenuItem("티본스테이크", Money.wons(55000), MenuCategory.MAIN),
                new MenuItem("바비큐립", Money.wons(54000), MenuCategory.MAIN),
                new MenuItem("해산물파스타", Money.wons(35000), MenuCategory.MAIN),
                new MenuItem("크리스마스파스타", Money.wons(25000), MenuCategory.MAIN),
                new MenuItem("초코케이크", Money.wons(15000), MenuCategory.DESSERT),
                new MenuItem("아이스크림", Money.wons(5000), MenuCategory.DESSERT),
                new MenuItem("제로콜라", Money.wons(3000), MenuCategory.BEVERAGE),
                new MenuItem("레드와인", Money.wons(60000), MenuCategory.BEVERAGE),
                new MenuItem("샴페인", Money.wons(25000), MenuCategory.BEVERAGE)
        ).stream().collect(Collectors.toMap(MenuItem::getName, item -> item));
    }
}
