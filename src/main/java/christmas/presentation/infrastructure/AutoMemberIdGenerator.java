package christmas.presentation.infrastructure;

import java.util.concurrent.atomic.AtomicLong;

public class AutoMemberIdGenerator implements IdGenerator{
    private AtomicLong currentId;

    public AutoMemberIdGenerator(long initialValue) {
        this.currentId = new AtomicLong(initialValue);
    }

    public synchronized Long getNextId() {
        return currentId.incrementAndGet();
    }

}
