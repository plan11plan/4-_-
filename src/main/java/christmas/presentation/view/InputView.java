package christmas.presentation.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.domain.member.domain.MemberId;
import christmas.presentation.infrastructure.IdGenerator;
import christmas.presentation.request.CreateOrderRequest;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public CreateOrderRequest readOrderRequest(IdGenerator idGenerator) {
        LocalDate orderDate = readDate();
        List<UnCertifiedMenuItem> orderItems = readOrderItems();
        return new CreateOrderRequest(new MemberId(idGenerator.getNextId()), orderDate, orderItems);
    }

    private LocalDate readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        int day = Integer.parseInt(Console.readLine());
        return LocalDate.of(2023, 12, day);
    }

    private List<UnCertifiedMenuItem> readOrderItems() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String input = Console.readLine();
        return Arrays.stream(input.split(","))
                .map(this::parseOrderItem)
                .collect(Collectors.toList());
    }

    private UnCertifiedMenuItem parseOrderItem(String item) {
        String[] parts = item.trim().split("-");
        if (parts.length != 2) {
            throw new IllegalArgumentException("유효하지 않은 주문 형식입니다.");
        }
        String menuName = parts[0].trim();
        int quantity = Integer.parseInt(parts[1].trim());
        return new UnCertifiedMenuItem(menuName, quantity);
    }
}
