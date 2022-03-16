package Homeworks.hw2;

public class Treadmill extends Obstacles {
    int length;

    Treadmill(int length) {
        this.length = length;
    }

    @Override
    boolean  overcame(BeAbleParticipate b) {
        return b.run(length);
    }
}
