package Lessons.Lesson2;

public class MainApp {
    static class Human {
        private Transport currentTransport;
        void drive(Transport transport) {
           transport.start();
           this.currentTransport = transport;
        }

        void stop() {
            if(currentTransport !=null) {
                currentTransport.stop();
                currentTransport = null;
            } else
                System.out.println("I haven't any transport");
        }

    }

    static class Car implements Transport {
        @Override
        public void start() {
            System.out.println("Car moves");
        }

        @Override
        public void stop() {
            System.out.println("Car stop");
        }
    }

    static class Skateboard implements Transport {
        @Override
        public void start() {
            System.out.println("Skateboard moves");
        }

        @Override
        public void stop() {
            System.out.println("Skateboard stop");
        }
    }

    static class Bicycle implements Transport {
        @Override
        public void start() {
            System.out.println("Bicycle moves");
        }

        @Override
        public void stop() {
            System.out.println("Bicycle stop");
        }
    }

    static class Tractor implements Transport {
        @Override
        public void start() {
            System.out.println("Tractor moves");
        }

        @Override
        public void stop() {
            System.out.println("Tractor stop");
        }
    }

    public static void main(String[] args) {
//        Flyable[] flyables = {
//                new Duck(),
//                new Airplane()
//        };
//        for (Flyable f : flyables) {
//            f.fly();
//        }
        Human human = new Human();
        human.stop();
        human.drive(new Tractor());
        human.stop();
    }
}
