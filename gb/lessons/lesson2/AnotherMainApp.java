package lessons.lesson2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherMainApp {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.currentDateInfo();

        // ---------------------------------
        Inner inner = new AnotherMainApp().new Inner(14);
        Inner2 inner2 = new Inner2(12);

        // ---------------------------------
        class Point {   // local class
            int x;

            Point(int x, int y) {
                this.x = x;
            }

            public void info() {
                System.out.println(x);
            }
        }

        // ----------------------------------
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
            }
        };
        System.out.println(flyable.getClass().getName()); // AnotherMainApp$1

        Animal animal = new Animal() {
            @Override
            void run() {
            }
        };
        System.out.println(animal.getClass().getName()); // AnotherMainApp$2

        // ---------------
        JButton button = new JButton("Btn1");
        JButton button2 = new JButton("Btn2");
        JButton button3 = new JButton("Btn3");
        button.addActionListener(new ButtonAction());
        button2.addActionListener(new ButtonAction2());
        button3.addActionListener(new ActionListener() {    // anonymous
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(3);
            }
        });

        // ----------------
        doSomething((a, b, c) -> System.out.println(a + b + c));

        /// ----------
//        Stream
//                .of(1,2,3,4,5,6)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return false;
//                    }
//                });

    }

    public static void doSomething(MyInterface myInterface) {
        myInterface.sum(1, 2, 3);
    }

    class Inner {   // inner class
        int innerValue;

        Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(outerValue);
            System.out.println(innerValue);
        }
    }

    static class Inner2 {
        int innerValue;

        Inner2(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
//            System.out.println(outerValue);
            System.out.println(innerValue);
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);
        Inner inner = new Inner(10);
    }
}
