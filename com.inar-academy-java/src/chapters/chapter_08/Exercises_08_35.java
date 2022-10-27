package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_35 {
    /* Largest block
        1- prompt the user to enter the number of rows in the matrix
        2- prompt the user to enter the matrix row by row
        3-  display the location of the first element in the maximum square submatrix
         and the number of the rows in the submatrix
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        fillArrWithInput(matrix, input);

        int[] result = findLargestBlock(matrix);
        System.out.println("The maximum square submatrix is at (" + result[0] + ", " +
                result[1] + "with size " + result[2]);
    }
    public static void fillArrWithInput(int[][] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }
    public static int[] findLargestBlock(int[][] matrix) {
        int[] a = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }
        return a;
    }
}
