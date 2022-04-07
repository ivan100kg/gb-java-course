package lessons.lesson7;

import java.util.concurrent.Semaphore;

public class SimpleSemaphoreApp {
    public static void main(String[] args) {
        Semaphore smp = new Semaphore(2);
        for (int i = 0; i < 5; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    System.out.println("Поток " + w + " перед семафором");
                    smp.acquire();
                    System.out.println("Поток " + w + " получил доступ к ресурсу");
                    Thread.sleep(2000 * (int)(Math.random() * 4.0));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Поток " + w + " освободил ресурс");
                    smp.release();
                }
            }).start();
        }
    }
}
