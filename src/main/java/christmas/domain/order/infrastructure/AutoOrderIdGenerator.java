package christmas.domain.order.infrastructure;

import christmas.domain.order.domain.OrderIdGenerator;
import java.util.concurrent.atomic.AtomicLong;

public class AutoOrderIdGenerator implements OrderIdGenerator {
    private AtomicLong currentId;

    public AutoOrderIdGenerator(long initialValue) {
        this.currentId = new AtomicLong(initialValue);
    }
    public synchronized Long getNextId(){
        return currentId.incrementAndGet();
    }
}
