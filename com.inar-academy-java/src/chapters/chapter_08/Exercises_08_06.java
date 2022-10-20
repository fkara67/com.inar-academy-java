package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_06 {
    /* 1- prompt the user to enter two matrix
       2- multiply each elements in same index of these two matrix
       3- create third matrix and initialize each multiplication in same index of two matrix
       4- display the result
 */
    public static void main(String[] args) {

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = readInput();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = readInput();

        double[][] multipliedMatrix =  multiplyMatrix(matrix1,matrix2);
        System.out.println("The multiplication of the matrices is");
        displayMultiplication(matrix1, matrix2, multipliedMatrix);
    }
    public static double[][] readInput() {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_ROWS = 3;
        final int NUMBER_OF_COLUMNS = 3;
        double[][] matrix = new double[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i = 0; i < result.length; i++) {
                    result[row][col] += a[row][i] * b[i][col];
                }
            }
        }
        return result;
    }
    public static void displayMultiplication(double[][] a, double[][] b, double[][] result) {
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.printf("%5s",a[row][col]);
            }
            System.out.print(((row == 1) ? "  *  " : "     "));
            for (int col = 0; col < a[row].length; col++) {
                System.out.printf("%5s",b[row][col]);
            }
            System.out.print(((row == 1) ? "  =  " : "     "));
            for (int col = 0; col < a[row].length; col++) {
                System.out.printf("%5.1f",result[row][col]);
            }
            System.out.println();
        }
    }
}
