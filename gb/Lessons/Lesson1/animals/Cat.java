package Lessons.Lesson1.animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + ": meow");
    }

    public void catMethod() {
        System.out.println("catMethod");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
