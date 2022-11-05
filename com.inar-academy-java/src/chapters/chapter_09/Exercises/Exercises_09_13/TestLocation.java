package chapters.chapter_09.Exercises.Exercises_09_13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns in the array: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        double[][] arr = new double[row][col];
        fillArrWithInput(arr, input);
        Location max = Location.locateLargest(arr);

        System.out.println("The location of the largest element is "
                + max.maxValue + " at (" + max.row + "," + max.column + ")");
    }
    public static void fillArrWithInput(double[][] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
    }
}
