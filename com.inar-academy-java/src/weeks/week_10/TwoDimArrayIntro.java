package weeks.week_10;

import java.util.Scanner;

public class TwoDimArrayIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRow = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int numberOfColumn = input.nextInt();
        int[][] arr = new int[numberOfRow][numberOfColumn];
        fill2DimArrWithRandomValues(arr,0,10);
        display2DimArr(arr,numberOfColumn);

    }
    public static void fill2DimArrWithRandomValues(int[][]arr, int start, int limit) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int)(Math.random() * limit) + start;
            }
        }
    }
    public static void display2DimArr(int[][] arr,int numberOfCol) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + (((col + 1) % numberOfCol == 0) ? "\n" : "  "));
            }
        }
    }
}
