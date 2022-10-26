package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_25 {
    /* Markov matrix
        1-  prompt the user to enter a 3 * 3 matrix of double values
        2- check whether each element is positive
        3- check whether the sum of the elements in each column is 1
        4- display the results
     */
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        fillArrWithInput(matrix);

        System.out.println("It is " + (isMarkovMatrix(matrix) ? "" : "not ") + "a Markov matrix");
    }
    public static void fillArrWithInput(double[][] arr) {
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextDouble();
            }
        }
    }
    public static boolean isMarkovMatrix(double[][] arr) {
        return(checkPositive(arr) && checkSumOfColumns(arr));
    }
    public static boolean checkPositive(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkSumOfColumns(double[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            double sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
}
