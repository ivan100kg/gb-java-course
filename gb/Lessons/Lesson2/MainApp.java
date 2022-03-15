package Lessons.Lesson2;

public class MainApp {
    static class Human {

    }

    static class Car {

    }

    static class Skateboard {

    }

    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duck(),
                new Airplane()
        };
        for (Flyable f : flyables) {
            f.fly();
        }
    }
}
