package lessons.lesson7;

public class TempApp {
    static private Integer mon = 1;

    public static void main(String[] args) {
//        for (int i = 0; i<10; i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(i);  // нельзя изменяемую в коде переменную
//                }
//            }).start();
//        }

        new Thread(() -> {
            synchronized (mon) {
                System.out.println("1-start");
                mon++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("1-end");
        }).start();
        new Thread(() -> {
            synchronized (mon) {
                System.out.println("2-start");
                mon++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("2-end");
        }).start();
        new Thread(() -> {
            synchronized (mon) {
                System.out.println("3-start");
                mon++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("3-end");
        }).start();
    }
}
