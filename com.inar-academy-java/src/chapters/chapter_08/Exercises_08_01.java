package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_01 {
    /* 1- prompt the user to enter 3-by-4 matrix
       2- read and initialize input a two-dimensional array
       3- display the sum of each column
       4- write sumColumn method
     */
    public static void main(String[] args) {

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = readInput();

        //display sum of each column.
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
        }

    }
    public static double[][] readInput() {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[3][4];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = input.nextDouble();
            }
        }
        return result;
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
