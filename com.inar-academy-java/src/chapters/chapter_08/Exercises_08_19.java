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
        display(matrix);

        if (isConsecutiveFour(matrix)) {
            System.out.println("Matrix has a consecutive four");
        }
        if (!isConsecutiveFour(matrix)){
            System.out.println("Matrix has not a consecutive four");
        }
    }
    public static int[][] createMatrixWithRandomValues(int row, int column) {
        int[][] matrix = new int[row][column];
        Scanner input = new Scanner(System.in);
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
            for (int col = 0; col < values[row].length - 3; col++) {
                int count = 1;
                for (int j = col + 1; j < col + 4; j++) {
                    if (values[row][col] == values[row][j]) {
                        count++;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourInColumn(int[][] values) {
        for (int col = 0; col < values[0].length; col++) {
            for (int row = 0; row < values.length - 3; row++) {
                int count = 1;
                for (int i = row + 1; i < row + 4; i++) {
                    if (values[row][col] == values[i][col]) {
                        count++;
                    }
                }
                if (count == 4) {
                    return true;
                }
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
        for (int row = 0; row < values.length - 3; row++) {
            for (int col = 3; col < values[row].length; col++) {
                int count = 1;
                for (int i = row + 1, j = col - 1; i < row + 4; i++,j--) {
                    if (values[row][col] == values[i][j]) {
                        count++;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourInRightDiagonal(int[][] values) {
        for (int row = 0; row < values.length - 3; row++) {
            for (int col = 0; col < values[row].length - 3; col++) {
                int count = 1;
                for (int i = row + 1, j = col + 1; i < row + 4; i++, j++) {
                    if (values[row][col] == values[i][j]) {
                        count++;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
