package lessons.lesson1;

import lessons.lesson1.animals.Cat;
import lessons.lesson1.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White", 2);
        Cat cat2 = new Cat("Murzik", "Black", 4);
        Dog dog1 = new Dog("Bobik", "White", 3);

        cat1.voice();
        dog1.voice();

//        Animal animal = new Dog("Animal", "Black", 10);
//        animal.voice();
//        if (animal instanceof Cat) {
//            ((Cat) animal).catMethod();  // catMethod
//        } else {
//            System.out.println("It doesn't a cat");
//        }

        System.out.println(cat1);

        Box box1 = new Box("Green", 2);
        Box box2 = new Box("Red", 2);

        System.out.println(box1.equals(box2));
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());

    }

}
