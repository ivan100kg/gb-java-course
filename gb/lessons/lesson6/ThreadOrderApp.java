package lessons.lesson6;

public class ThreadOrderApp {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(1)).start();
        new Thread(() -> System.out.println(2)).start();
        new Thread(() -> System.out.println(3)).start();
    }
}
