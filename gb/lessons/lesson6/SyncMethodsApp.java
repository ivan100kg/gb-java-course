package lessons.lesson6;

public class SyncMethodsApp {
    public static void main(String[] args) {
        SyncMethodsApp e1 = new SyncMethodsApp();
        SyncMethodsApp e2 = new SyncMethodsApp();
        new Thread(e1::method1).start();
        new Thread(()-> e1.method2()).start();
    }

    public synchronized void method1() {
        System.out.println("M1-START");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M1-END");
    }

    public synchronized void method2(){
        System.out.println("M2-START");
        for (int i =0; i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M2-END");
    }

    public void method3(){
        System.out.println("M3-START");
        for (int i =0; i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M3-END");
    }
}
