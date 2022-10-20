package chapters.chapter_08;

import java.util.Arrays;

public class Exercises_08_22 {
    /* 1- generate a 6-by-6 two-dimensional matrix
       2- fill this matrix with  random 0s and 1s
       3- print this matrix
       4- check if every row and every column have an even number of 1s.
     */
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        fillArray(matrix);
        printArray(matrix);
        System.out.println((checkRows(matrix) && checkColumns(matrix)) ?
                "every row and column have an even number of 1s" :
                "every row and column does not have an even number of 1s" );
    }
    public static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();


        }
    }
    public static boolean checkRows(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            int count = 0;
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkColumns(int[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            int count = 0;
            for (int row = 0; row < arr.length; row++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
