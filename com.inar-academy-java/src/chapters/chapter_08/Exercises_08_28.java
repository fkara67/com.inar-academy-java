package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        System.out.print("Enter list 1: ");
        Exercises_08_16.fillArray(arr1,input);


        int[][] arr2 = new int[3][3];
        System.out.print("Enter list 2: ");
        Exercises_08_16.fillArray(arr2,input);


        System.out.println("\nThe arr1 and arr2 are " +
                ((equals(arr1, arr2)) ? " strictly equals" : " not strictly equals"));

    }
    public static boolean equals(int[][] arr1, int[][] arr2) {
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {

                if (arr1[row][col] != arr2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
