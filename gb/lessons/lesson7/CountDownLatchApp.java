package lessons.lesson7;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchApp {
    public static void main(String[] args) {
        final int THREADS_COUNT = 6;
        final CountDownLatch countDownLatch = new CountDownLatch(THREADS_COUNT);

        System.out.println("Start");
        for (int i = 0; i < THREADS_COUNT; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    Thread.sleep(200 + w + (int) (500 + Math.random()));
                    System.out.println("Thread #" + w + " is ready");
                    countDownLatch.countDown(); // убавляем счетчик на 1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            countDownLatch.await();     // поток main ждет завершения всех потоков
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work is completed");
    }
}
