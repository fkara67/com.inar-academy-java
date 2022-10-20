package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_08_11 {
    /* 1- prompt the user to enter a number between 0 and 511
       2- display the corresponding matrix with the characters H and T
       3- 0 stands for H and 1 for T
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int decimal = input.nextInt();
        int[] binary = decimalToBinary(decimal);
        System.out.println(Arrays.toString(binary));
        displayCorrespondingMatrix(binary);
    }
    public static int[] decimalToBinary(int decimal) {
        int[] binary = new int[9];
        int i = binary.length - 1;
        while (decimal != 0) {
            binary[i] = decimal % 2;
            decimal /= 2;
            i--;
        }
        return binary;
    }
    public static void displayCorrespondingMatrix(int[] binary) {
        char[][] headOrTails = new char[3][3];
        int k = 0;
        for (int i = 0; i < headOrTails.length; i++) {
            for (int j = 0; j < headOrTails[i].length; j++, k++) {
                if (binary[k] == 0) {
                    headOrTails[i][j] = 'H';
                }
                else
                    headOrTails[i][j] = 'T';
            }
        }

        for (int i = 0; i < headOrTails.length; i++) {
            for (int j = 0; j < headOrTails[i].length; j++) {
                System.out.print(headOrTails[i][j] + " ");
            }
            System.out.println();
        }
    }
}
