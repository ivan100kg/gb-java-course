package Homeworks.hw2;

public class Cat implements BeAbleParticipate {
    final int MAX_LENGTH;
    final int MAX_HEIGHT;
    boolean inGame;

    Cat(int length, int height) {
        MAX_LENGTH = length;
        MAX_HEIGHT = height;
        inGame = true;
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_HEIGHT) {
            System.out.println("Cat jumped " + height + " m.");
            return true;
        }
        else {
            System.out.println("Cat didn't jump " + height + " m.");
            System.out.println("Cat exit");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= MAX_LENGTH) {
            System.out.println("Cat run " + length + " m.");
            return true;
        }
        else {
            System.out.println("Cat didn't run " + length + " m.");
            System.out.println("Cat exit");
            return false;
        }
    }
}
