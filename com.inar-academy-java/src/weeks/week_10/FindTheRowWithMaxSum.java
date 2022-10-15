package weeks.week_10;

import java.util.Scanner;

public class FindTheRowWithMaxSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRow = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int numberOfColumn = input.nextInt();
        int[][] arr = new int[numberOfRow][numberOfColumn];
        TwoDimArrayIntro.fill2DimArrWithRandomValues(arr,1,10);

        printArr(arr);
        System.out.println("The row with the max sum is " + findTheRowWithMaxSum(arr));
        System.out.println(arr[0][1]);
    }
    public static int findTheRowWithMaxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int row = 0; row < arr.length; row++) {
            int sumOfRow = getSum(arr[row]);
            if (maxSum < sumOfRow) {
                maxSum = sumOfRow;
                maxIndex = row;
            }
        }
        return maxIndex;
    }
    public static int getSum(int[] cols) {
        int sum = 0;
        for (int num : cols) {
            sum += num;
        }
        return sum;
    }
    public static void printArr(int[][] arr) {
        System.out.println("-----------------");
        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                System.out.printf(" [%3d] ", arr[satir][sutun]);
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}
