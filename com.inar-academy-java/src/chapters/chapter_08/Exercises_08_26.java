package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_08_26 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        fillArrayWithInput(matrix);

        System.out.println("The input array is ");
        printArray(matrix);

        double[][] rowSortedArray = sortJustInRows(matrix);

        System.out.println("\nThe row-sorted array is ");
        printArray(rowSortedArray);


    }
    public static void fillArrayWithInput(double[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
    }
    public static void printArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
    }
    public static double[][] sortJustInRows(double[][] arr) {
        double[][] result = new double[arr.length][arr[0].length];
        System.arraycopy(arr,0,result,0,arr.length);


        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i = col + 1; i < result[row].length; i++) {
                    if (result[row][col] > result[row][i]) {
                            double temp = result[row][col];
                            result[row][col] = result[row][i];
                            result[row][i] = temp;

                    }
                }
                
            }
        }
        return result;
    }
}
