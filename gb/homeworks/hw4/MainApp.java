package homeworks.hw4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static <T> void change(List<T> list, int i1, int i2) {
        T temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }

    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        // test change()
        ArrayList<String> aList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println((aList));
        change(aList, 0, 1);
        System.out.println((aList));

        // test toArrayList
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println(array);
        System.out.println(toArrayList(array));

        // test Box<>
        Box<Apple> aBox1 = new Box<>(new Apple(),
                new Apple(), new Apple());
        Box<Apple> aBox2 = new Box<>(new Apple(),
                new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> oBox1 = new Box<>(new Orange(),
                new Orange());
        Box<Orange> oBox2 = new Box<>(new Orange(),
                new Orange(), new Orange(), new Orange());

        aBox1.info();
//        aBox2.info();
        oBox1.info();
//        oBox2.info();

        System.out.println(aBox1.compare(oBox1));

        aBox1.add(new Apple());
        aBox1.info();
        oBox1.add(new Orange());
        oBox1.info();

        System.out.println(aBox1.compare(oBox1));

        aBox2.replace(aBox1);
        aBox1.info();
        aBox2.info();
    }
}

