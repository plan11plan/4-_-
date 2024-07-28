package christmas.domain.menu;

import christmas.domain.common.Money;
import christmas.domain.common.OrderItem;
import christmas.presentation.view.UnCertifiedMenuItem;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

   public  validateOrderItems(List<OrderItem> orderItems) {
        for (OrderItem item : orderItems) {
            if (!menuRepository.containsKey(item.getMenuItemName())) {
                throw new IllegalArgumentException("메뉴에 없는 항목입니다: " + item.getMenuItemName());
            }
            // 추가적인 검증 로직 (예: 최대 주문 가능 수량)
        }
    }

    public MenuDto certify(List<UnCertifiedMenuItem> unCertifiedMenuItems) {
        MenuItem menuItem = menuRepository.get(name);
        if (menuItem == null) {
            throw new IllegalArgumentException("메뉴에 없는 항목입니다: " + name);
        }
        return new MenuDto(menuItem);
    }


}
