package lessons.lesson7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTypesApp {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(10);
        ai.addAndGet(12);
        System.out.println(ai.getAndAdd(2));
        System.out.println(ai);
        ai.getAndAdd(2);
        ai.addAndGet(3);
        ai.decrementAndGet();
        ai.incrementAndGet();
        ai.getAndSet(4);
    }
}
