package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_08_23 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row:");
        fillArrWithInput(arr);

        System.out.println("The flipped cell is at " + Arrays.toString(findFlipped(arr)));
        
    }
    public static void fillArrWithInput(int[][] arr) {
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
    }

    public static int[] findFlipped(int[][] arr) {
        int[] indexOfCell = new int[2];

        for (int row = 0; row < arr.length; row++) {
            int count = 0;
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                indexOfCell[0] = row;

            }
        }
        for (int col = 0; col < arr[0].length; col++) {
            int count = 0;
            for (int row = 0; row < arr.length; row++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                indexOfCell[1] = col;

            }
        }
        return indexOfCell;
    }

    
}
