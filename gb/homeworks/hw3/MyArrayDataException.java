package homeworks.hw3;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int row, int column, String elem) {
        super("In row:" + row + ", column:" + column + " was gotten wrong element: \"" + elem + "\"");
    }
}
