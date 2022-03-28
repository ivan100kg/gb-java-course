package lessons.lesson6;

public class Counter {
    private int c;

    public int value() {
        return c;
    }

    public Counter() {
        c = 0;
    }

    public void inc() {
        c++;
    }

    public void dec() {
        c--;
    }
}

class TestCounter{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

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
