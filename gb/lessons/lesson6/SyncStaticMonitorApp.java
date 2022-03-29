package lessons.lesson6;

public class SyncStaticMonitorApp {
    public static void main(String[] args) {
        SyncStaticMonitorApp e = new SyncStaticMonitorApp();
        new Thread(() -> classMethod()).start();
        new Thread(() -> classMethod()).start();
        new Thread(() -> e.objectMethod()).start();
    }


    public synchronized static void classMethod() {
        System.out.println("Sync Static method -START");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sync Static method -END");
    }

    public synchronized void objectMethod() {
        System.out.println("Sync object method -START");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sync object method -END");
    }
}
