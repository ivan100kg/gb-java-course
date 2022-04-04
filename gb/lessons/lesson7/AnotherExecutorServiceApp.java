package lessons.lesson7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class AnotherExecutorServiceApp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setPriority(10);
                t.setName("abc");
                System.out.println("created");
                return t;
            }
        });

        ScheduledExecutorService s = Executors.newScheduledThreadPool(2);

        service.execute(() -> System.out.println(1));
        Thread.sleep(2000);
        service.execute(() -> System.out.println(2));
        Thread.sleep(2000);
        service.execute(() -> System.out.println(3));
        Thread.sleep(2000);
        service.execute(() -> System.out.println(4));
        Thread.sleep(2000);
        service.execute(() -> System.out.println(5));

        service.shutdown();
    }
}
