package lessons.lesson4;

import java.util.*;
import java.util.function.Consumer;

public class MainApp {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//        // ...
////        intBox1.setObj("Java");
//        // ...
//        if(intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
//            int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
//            System.out.println("sum: " + sum);
//        } else {
//            System.out.println("error");
//        }

//        GenBox<String> strBox = new GenBox<>("Java");
//        GenBox<Integer> intBox1 = new GenBox<>(10);     // а тут все Integer
//        GenBox<Integer> intBox2 = new GenBox<>(20);     // а тут все Integer
//
//        int sum = intBox1.getObj() + intBox2.getObj();
//        System.out.println("sum: " + sum);

//        BoxWithNumbers<Integer> intBox1 = new BoxWithNumbers<>(new Integer[]{1, 2, 3, 4});
//        BoxWithNumbers<Integer> intBox2 = new BoxWithNumbers<>(new Integer[]{1, 2, 3, 4});
//        BoxWithNumbers<Double> doubleBox = new BoxWithNumbers<>(new Double[]{1.0, 2.0, 3.0, 4.0001});
//        BoxWithNumbers<Number> numBox = new BoxWithNumbers<>(1.2, 30, 3.14);
//
//        System.out.println(intBox1.average());
//        System.out.println(doubleBox.average());
//        System.out.println(numBox.average());
//        System.out.println(intBox1.compareAverage(doubleBox));
//
//        // ----------
//        GenBox<Number> gbNum1 = new GenBox<>(1);
//        GenBox<Integer> gbInt1 = new GenBox<>(1);
//        doSomething1(gbNum1);
//        doSomething2(gbNum1);
//        doSomething1(gbInt1);
        ArrayList<String> aList = new ArrayList<>();
//        aList.ensureCapacity(10000000);
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("b", "cx", "a")); // так
        l4.trimToSize();
//        l4.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

//        l4.sort((o1, o2) -> o1.length() - o2.length());
//        Collections.sort(l4);
//        Comparator<String> comparator = new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        l4.sort(comparator);
//        System.out.println(l4);
//
//        l4.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s.length());
//            }
//        });
        List<String> linkedList = new LinkedList<>();

    }

    public static void doSomething1(GenBox<? extends Number> box) {
    }

    public static void doSomething2(GenBox<Number> box) {
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }
}
