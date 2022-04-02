package lessons.lesson6;

public class WaitNotifyApp {
    private final Object mon = new Object();
    private volatile char currentLatter = 'A';

    public static void main(String[] args) {
        WaitNotifyApp waitNotifyApp = new WaitNotifyApp();
        new Thread(() -> {
            waitNotifyApp.printA();
        }).start();
        new Thread(() -> {
            waitNotifyApp.printB();
        }).start();

    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i<5; i++){
                    while (currentLatter != 'A'){
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLatter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i<5; i++){
                    while (currentLatter != 'B'){
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLatter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
