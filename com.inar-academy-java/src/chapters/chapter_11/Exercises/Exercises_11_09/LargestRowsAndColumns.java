package chapters.chapter_11.Exercises.Exercises_11_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        fillArrayWithRandom(matrix);
        displayArray(matrix);
        ArrayList<Integer> rows = findRowsWithMost1s(matrix);
        ArrayList<Integer> cols = findColsWithMost1s(matrix);
        displayMost1sInRowsAndColumns(rows,cols);
    }
    public static void fillArrayWithRandom(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    public static void displayArray(int[][] matrix) {
        for (int[] n : matrix) {
            System.out.println(Arrays.toString(n));
        }
    }
    public static ArrayList<Integer> findRowsWithMost1s(int[][] matrix) {
        int maxNumber = findTheMaxCountInRows(matrix);
        ArrayList<Integer> rowsWithMost1s = new ArrayList<>();
        if (maxNumber == 0) {
            return rowsWithMost1s;
        }
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count == maxNumber) {
                rowsWithMost1s.add(row);
            }
        }
        return rowsWithMost1s;
    }
    public static ArrayList<Integer> findColsWithMost1s(int[][] matrix) {
        int maxNumber = findTheMaxCountInCols(matrix);
        ArrayList<Integer> colsWithMost1s = new ArrayList<>();
        if (maxNumber == 0) {
            return colsWithMost1s;
        }
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count == maxNumber) {
                colsWithMost1s.add(col);
            }
        }
        return colsWithMost1s;
    }
    public static int findTheMaxCountInRows(int[][] matrix) {
        int maxCount = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static int findTheMaxCountInCols(int[][] matrix) {
        int maxCount = Integer.MIN_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static void displayMost1sInRowsAndColumns(ArrayList<Integer> rows, ArrayList<Integer> cols) {
        if (rows.isEmpty()) {
            System.out.println("There are not any '1' in any rows!");
        } else
            System.out.println("The largest row index: " + rows);

        if (cols.isEmpty()) {
            System.out.println("There are not any '1' in any columns!");
        } else
            System.out.println("The largest column index: " + cols);
    }
}
