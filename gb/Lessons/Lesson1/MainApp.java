package Lessons.Lesson1;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White", 2);
        Cat cat2 = new Cat("Murzik", "Black", 4);
        Cat.doSomething();
        cat1.setName("Murka");

        Cat[] cats = new Cat[2];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[0].info();

        doSomething();
        doSomething();
    }

    public static void doSomething() {
        int b;
    }
}
