package Lessons.Lesson1;

public class Cat {
    // поля нужно делать private
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void meow() {
        System.out.println(name + " meow");
    }

    public static void doSomething() {
        System.out.println("Static method");
    }
}
