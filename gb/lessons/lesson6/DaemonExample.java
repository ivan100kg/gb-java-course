package lessons.lesson6;

import java.util.Arrays;

public class DaemonExample {
    public static void main(String[] args) {
        Thread tTimer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (Thread.currentThread().isInterrupted()) break;
                System.out.println("thread-" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        tTimer.setDaemon(true);
        tTimer.start();
        System.out.println("main -> sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tTimer.interrupt();
        System.out.println(tTimer.isDaemon());
        System.out.println(tTimer.isAlive());
        System.out.println(tTimer.isInterrupted());

        System.out.println("main: -> end");
    }
}
