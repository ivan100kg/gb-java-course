package Lessons.Lesson1;

public class Cat extends Animal{
    public Cat(){
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 5) {
            this.name = name;
        }
        else throw new IllegalArgumentException(name + " is too long");
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
