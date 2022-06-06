package lessons.lesson9;

public class TestClass {
    @MyAnnotation(priority = 20)
    public static void method1() {
        System.out.println("method1");
    }

    @MyAnnotation(priority = 2)
    public static void method2() {
        System.out.println("method2");
    }

    @MyAnnotation
    public static void method3() {
        System.out.println("method3");
    }
}
