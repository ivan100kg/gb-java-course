package Homeworks.hw2;

public class Human implements BeAbleParticipate {
    final int MAX_LENGTH;
    final int MAX_HEIGHT;
    boolean inGame;

    Human(int length, int height) {
        MAX_LENGTH = length;
        MAX_HEIGHT = height;
        inGame = true;
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_HEIGHT) {
            System.out.println("Human jumped " + height + " m.");
            return true;
        }
        else {
            System.out.println("Human didn't jump " + height + " m.");
            System.out.println("Human exit");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= MAX_LENGTH) {
            System.out.println("Human run " + length + " m.");
            return true;
        }
        else {
            System.out.println("Human didn't run " + length + " m.");
            System.out.println("Human exit");
            return false;
        }
    }
}
