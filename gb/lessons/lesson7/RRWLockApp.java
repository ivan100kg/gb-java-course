package lessons.lesson7;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RRWLockApp {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        // read
        new Thread(() -> {
            rwl.readLock().lock();
            try {
                System.out.println("1-thread-start-reading");
                Thread.sleep(3000);
                System.out.println("1-thread-end-reading");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                rwl.readLock().unlock();
            }
        }).start();

        new Thread(() -> {
            rwl.readLock().lock();
            try {
                System.out.println("2-thread-start-reading");
                Thread.sleep(3000);
                System.out.println("2-thread-end-reading");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                rwl.readLock().unlock();
            }
        }).start();

        // write
        new Thread(() -> {
            rwl.writeLock().lock();
            try {
                System.out.println("3-thread-start-writing");
                Thread.sleep(3000);
                System.out.println("3-thread-end-writing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                rwl.writeLock().unlock();
            }
        }).start();

        new Thread(() -> {
            rwl.writeLock().lock();
            try {
                System.out.println("4-thread-start-writing");
                Thread.sleep(3000);
                System.out.println("4-thread-end-writing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                rwl.writeLock().unlock();
            }
        }).start();
    }
}
