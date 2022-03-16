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
    public void jump(int height) {
        if(height <= MAX_HEIGHT)
            System.out.println("Cat jump " + height + " m.");
        else {
            System.out.println("Cat didn't jump " + height + " m.");
            inGame = false;
            System.out.println("Cat exit");
        }
    }

    @Override
    public void run(int length) {
        if(length <= MAX_LENGTH)
            System.out.println("Cat run " + length + " m.");
        else {
            System.out.println("Cat didn't run " + length + " m.");
            inGame = false;
            System.out.println("Cat exit");

        }
    }

    @Override
    public boolean inGame() {
        return inGame;
    }
}
