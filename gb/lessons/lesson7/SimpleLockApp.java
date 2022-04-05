package lessons.lesson7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleLockApp {
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();

        new Thread(() -> {
            System.out.println("T-BEFORE-LOCK-1");
            lock.lock();
            System.out.println("T-GET-LOCK-1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("T-END-1");
                lock.unlock();
            }
        }).start();
        new Thread(() -> {
            System.out.println("T-BEFORE-LOCK-2");
            try {
                if (lock.tryLock(1, TimeUnit.HOURS)) {
                    lock.lock();
                    System.out.println("T-GET-LOCK-2");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("T-END-2");
                        lock.unlock();
                    }
                } else {
                    System.out.println("T-2-TRY-FALSE-WAITING 1 HOUR");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            System.out.println("T-BEFORE-LOCK-3");
            if (lock.tryLock()) {
                lock.lock();
                System.out.println("T-GET-LOCK-3");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("T-END-3");
                    lock.unlock();
                }
            } else {
                System.out.println("T-3-TRY-FALSE");
            }
        }).start();
    }
}
