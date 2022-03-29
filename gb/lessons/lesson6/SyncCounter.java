package lessons.lesson6;

public class SyncCounter {
    private int c;

    public int value() {
        return c;
    }

    public SyncCounter() {
        c = 0;
    }

    public synchronized void inc() {
        c++;
    }

    public synchronized void dec() {
        c--;
    }
}

class TestSyncCounter{
    public static void main(String[] args) throws InterruptedException {
        SyncCounter counter = new SyncCounter();

        Thread incThread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                counter.inc();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decThread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                counter.dec();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incThread.start();
        decThread.start();
        incThread.join();
        decThread.join();

        System.out.println("counter = " + counter.value());
    }
}
