package Lessons.Lesson2;

public interface Flyable {
    default void fly() {
        System.out.println("default fly");
    }
}
