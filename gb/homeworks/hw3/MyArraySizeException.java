package homeworks.hw3;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int size) {
        super("Wrong array size, 4x4 needed, but " + size + " was gotten");
    }
}
