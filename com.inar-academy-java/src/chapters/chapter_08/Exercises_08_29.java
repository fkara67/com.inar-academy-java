package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_08_29 {
    /* Identical arrays
       1- prompt the user to enter two 3 * 3 arrays of integers
       2- sort these arrays in each elements
       3- check and display whether the two are identical.
     */
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] list1 = new int[3][3];
        fillArrayWithInput(list1);
        System.out.print("Enter list2: ");
        int[][] list2 = new int[3][3];
        fillArrayWithInput(list2);
        sort(list1);
        sort(list2);
        for (int i = 0; i < list1.length; i++) {
            System.out.println(Arrays.toString(list1[i]));

        }

        System.out.println("The two arrays are " + (equals(list1,list2) ? "" : "not ") +  "identical");
    }
    public static void fillArrayWithInput(int[][] list) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list[row].length; col++) {
                list[row][col] = input.nextInt();
            }
        }
    }
    public static void sort(int[][] list) {
        int a = Integer.MIN_VALUE;
        int aRow = -1;
        int aCol = -1;
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list[row].length; col++) {
                if (a > list[row][col]) {
                    int temp = list[row][col];
                    list[row][col] = list[aRow][aCol];
                    list[aRow][aCol] = temp;
                }
                a = list[row][col];
                aRow = row;
                aCol = col;
            }
        }
    }
    public static boolean equals(int[][] list1, int[][] list2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (list1[i][j] != list2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
