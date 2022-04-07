package lessons.lesson8;

public class MainApp {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello")).start();
        doSomething(s -> System.out.println(s + " !!!"), "Hi");

    }

    public static void doSomething(MyInterface<String> myInterface, String s) {
        myInterface.get(s);
    }

}
