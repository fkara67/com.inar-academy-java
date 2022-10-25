package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = input.nextInt();
        System.out.print("Enter column: ");
        int column = input.nextInt();

        int[][] matrix = createMatrixWithRandomValues(row,column);

        if (isConsecutiveFour(matrix)) {
            System.out.println("Matrix has a consequtive four");
        }
        else {
            System.out.println("Matrix has not a consequtive four");
        }
    }
    public static int[][] createMatrixWithRandomValues(int row, int column) {
        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }
    public static boolean isConsecutiveFour(int[][] values) {
        if (isConsecutiveFourInRow(values)) {
            return true;
        } 
        else if (isConsecutiveFourInColumn(values)) {
            return true;
        } 
        else if (isConsecutiveFourInDiagonal(values)) {
            return true;
        }
        return false;
    }
    public static boolean isConsecutiveFourInRow(int[][] values) {
        for (int row = 0; row < values.length; row++) {
            int count = 1;
            for (int col = 0; col < values[row].length - 1; col++) {
                if (values[row][col] == values[row][col + 1]) {
                    count++;
                }
                else {
                    count = 1;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourInColumn(int[][] values) {
        for (int col = 0; col < values[0].length; col++) {
            int count = 1;
            for (int row = 0; row < values.length - 1; row++) {
                if (values[row][col] == values[row + 1][col]) {
                    count++;
                }
                else {
                    count = 1;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourInDiagonal(int[][] values) {
        if (isConsecutiveFourInLeftDiagonal(values)) {
            return true;
        }
        else if (isConsecutiveFourInRightDiagonal(values)) {
            return true;
        }
        return false;
    }
    public static boolean isConsecutiveFourInLeftDiagonal(int[][] values) {
        int number = values[0][3];
        for (int row = 1, col = 2; row < values.length - 3; row++, col--) {
            if (values[row][col] == values[row][col]) {
                return true;
            }


        }
        return false;
    }
    public static boolean isConsecutiveFourInRightDiagonal(int[][] values) {
        return false;
    }
}
