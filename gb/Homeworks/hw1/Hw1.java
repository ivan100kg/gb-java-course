package Homeworks.hw1;

public class Hw1 {
    public static void main(String[] args) {
        Animal[] arr = {new HomeCat("Murzik"),
                new Dog("Bobik"),
                new Tiger("Sherhan"),
                new HomeCat("Murka"),
                new Dog("Sharik"),
                new Tiger("Matros"),
                new Dog("Tuzik"),
                new HomeCat("Anfiska"),
                new Tiger("Sablezub"),
                new HomeCat("Filka"),
                new Tiger("Borg")};

        for (Animal a : arr) {
            a.run(300);
            a.swim(8);
        }
        System.out.println("Total animals: " + Animal.count);
    }
}

abstract class Animal {
    String name;
    static int count;

    Animal(String name) {
        this.name = name;
        count++;
    }

    abstract void run(int length);

    abstract void swim(int length);
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 500)
            System.out.println(name + " can't run so long: " + length);
        else
            System.out.println(name + " has run " + length);
    }

    @Override
    void swim(int length) {
        if (length > 10)
            System.out.println(name + " can't swim so long: " + length);
        else
            System.out.println(name + " has swum " + length);
    }
}

class HomeCat extends Animal {

    HomeCat(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 200)
            System.out.println(name + " can't run so long: " + length);
        else
            System.out.println(name + " has run " + length);
    }

    @Override
    void swim(int length) {
        System.out.println(name + " can't swim");
    }
}

class Tiger extends Animal {

    Tiger(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 300)
            System.out.println(name + " can't run so long: " + length);
        else
            System.out.println(name + " has run " + length);
    }

    @Override
    void swim(int length) {
        System.out.println(name + " can't swim");
    }
}
