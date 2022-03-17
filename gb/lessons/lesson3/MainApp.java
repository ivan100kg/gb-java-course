package lessons.lesson3;

public class MainApp {
    public static void main(String[] args) {
//        a();
        try {
            System.out.println(1);
            int x = 10 / 0;
            System.out.println(2);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(3);

    }

    public static void a() {
        b();
    }

    public static void b() {
        int x = 10 / 0;
    }

}
