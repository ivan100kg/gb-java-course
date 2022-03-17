package homeworks.hw2;

public class Wall extends Obstacles {
    int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    boolean overcame(BeAbleParticipate b) {
        return b.jump(height);
    }
}
