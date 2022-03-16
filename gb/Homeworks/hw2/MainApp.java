package Homeworks.hw2;

public class MainApp {
    public static void main(String[] args) {
        BeAbleParticipate[] participants = {
                new Human(6000, 1),
                new Cat(1500, 2),
                new Robot(12000, 3)
        };
        Obstacles[] obstacles = {
                new Wall(1),
                new Treadmill(1000),
                new Wall(2),
                new Treadmill(2000),
                new Wall(3),
                new Treadmill(10000),
                new Wall(10),
                new Treadmill(20)
        };

        for (BeAbleParticipate b : participants) {
            for (Obstacles o : obstacles) {
                if (!(o.overcame(b))) break;
            }
        }

    }
}
