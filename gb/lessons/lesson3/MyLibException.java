package lessons.lesson3;

public class MyLibException extends RuntimeException {
    public MyLibException() {

    }

    public MyLibException(String msg) {
        super(msg);
    }
}
