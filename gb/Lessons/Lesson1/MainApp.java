package Lessons.Lesson1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White", 2);
        Cat cat2 = new Cat("Murzik", "Black", 4);
        cat1.info();
        cat2.info();
        Cat.doSomething();
    }
}
