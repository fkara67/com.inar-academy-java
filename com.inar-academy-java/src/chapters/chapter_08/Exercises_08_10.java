package chapters.chapter_08;

public class Exercises_08_10 {
    /* 1- create a two-dim arr for 4-by-4 matrix
       2- randomly fill 0s and 1s in 4-by-4 matrix
       3- print the matrix
       4- find the first row and column with the most 1s
     */
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        fillArray(matrix);
        printArray(matrix);
        displayRowWithTheMost1s(matrix);
        displayColumnWithTheMost1s(matrix);
    }
    public static void fillArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void displayRowWithTheMost1s(int[][] matrix) {
        int maxCount = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                maxIndex = row;
            }
        }
        System.out.println("The largest row index: " + maxIndex);
    }
    public static void displayColumnWithTheMost1s(int[][] matrix) {
        int maxCount = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                maxIndex = col;
            }
        }
        System.out.println("The largest column index: " + maxIndex);
    }
}
