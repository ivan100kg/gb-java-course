package Homeworks.hw2;

public class Robot implements BeAbleParticipate {
    final int MAX_LENGTH;
    final int MAX_HEIGHT;
    boolean inGame;

    Robot(int length, int height) {
        MAX_LENGTH = length;
        MAX_HEIGHT = height;
        inGame = true;
    }

    @Override
    public void jump(int height) {
        if (height <= MAX_HEIGHT)
            System.out.println("Robot jump " + height + " m.");
        else {
            System.out.println("Robot didn't jump " + height + " m.");
            inGame = false;
            System.out.println("Robot exit");

        }
    }

    @Override
    public void run(int length) {
        if (length <= MAX_LENGTH)
            System.out.println("Robot run " + length + " m.");
        else {
            System.out.println("Robot didn't run " + length + " m.");
            inGame = false;
            System.out.println("Robot exit");

        }
    }


    @Override
    public boolean inGame() {
        return inGame;
    }
}
