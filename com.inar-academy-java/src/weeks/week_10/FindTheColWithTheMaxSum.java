package weeks.week_10;

import java.util.Scanner;

public class FindTheColWithTheMaxSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRow = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int numberOfColumn = input.nextInt();
        int[][] arr = new int[numberOfRow][numberOfColumn];
        TwoDimArrayIntro.fill2DimArrWithRandomValues(arr,1,10);

        FindTheRowWithMaxSum.printArr(arr);
        System.out.println("The row with the max sum is " + findTheColWithMaxSum(arr));
    }
    public static int findTheColWithMaxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            if (maxSum < sum) {
                maxSum = sum;
                maxIndex = col;

            }
        }
        return maxIndex;
    }

}
