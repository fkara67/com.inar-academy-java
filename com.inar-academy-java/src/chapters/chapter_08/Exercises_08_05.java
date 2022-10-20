package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_05 {
    /* 1- prompt the user to enter two matrix
       2- sum each elements in same index of these two matrix
       3- create third matrix and initialize each sum in same index of two matrix
       4- display the result
     */
    public static void main(String[] args) {

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = readInput();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = readInput();

        double[][] addedMatrix =  addMatrix(matrix1,matrix2);

        System.out.println("The matrices are added as follows ");
        displayAddition(matrix1,matrix2,addedMatrix);
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
    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }
    public static void displayAddition(double[][] matrix1, double[][] matrix2, double[][] addedMatrix) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%5s",matrix1[row][col]);
            }
            System.out.print(((row == 1) ? "  +  " : "     "));
            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%5s",matrix2[row][col]);
            }
            System.out.print(((row == 1) ? "  =  " : "     "));
            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.printf("%5s",addedMatrix[row][col]);
            }
            System.out.println();
        }
    }
}
