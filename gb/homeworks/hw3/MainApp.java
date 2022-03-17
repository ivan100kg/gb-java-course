package homeworks.hw3;

public class MainApp {
    public static void main(String[] args) {
        String[][] matrix = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };
        int result = 0;
        try {
            result = matrixSum(matrix);
            System.out.println("Sum of matrix = " + result);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static int matrixSum(String[][] array) {
        int result = 0;
        if (array.length != 4)
            throw new MyArraySizeException(array.length);
        for (String[] arr : array) {
            if (arr.length != 4)
                throw new MyArraySizeException(arr.length);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return result;

    }
}
