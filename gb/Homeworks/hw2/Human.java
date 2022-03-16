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
    public void jump(int height) {
        if (height <= MAX_HEIGHT)
            System.out.println("Human jumped " + height + " m.");
        else {
            System.out.println("Human didn't jump " + height + " m.");
            inGame = false;
            System.out.println("Human exit");
        }
    }

    @Override
    public void run(int length) {
        if (length <= MAX_LENGTH)
            System.out.println("Human run " + length + " m.");
        else {
            System.out.println("Human didn't run " + length + " m.");
            inGame = false;
            System.out.println("Human exit");
        }
    }

    @Override
    public boolean inGame() {
        return inGame;
    }
}
