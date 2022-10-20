package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_02 {
    /* 1- read a 4 * 4 matrix
       2- display the sum of all its elements on the major diagonal
       3- write a method  that sums all the numbers
       in the major diagonal in an n * n matrix of double values
     */
    public static void main(String[] args) {
        final int NUMBER_OF_ROWS = 4;
        final int NUMBER_OF_COLUMNS = 4;
        System.out.println("Enter a " + NUMBER_OF_ROWS + "*" + NUMBER_OF_COLUMNS +
                " matrix row by row");
        double[][] matrix = readInput(NUMBER_OF_ROWS,NUMBER_OF_COLUMNS);

        System.out.println("Sum of the elements in the major diagonal is " +
                sumMajorDiagonal(matrix));
    }
    public static double[][] readInput(int numberOfRows, int numberOfColumns) {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[numberOfRows][numberOfColumns];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = input.nextDouble();
            }
        }
        return result;
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
