package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        final int NUMBER_OF_INPUTS = 10;
        int[] distinctNumbers = new int[NUMBER_OF_INPUTS];
        int count = 0;
        for (int i = 0; i < NUMBER_OF_INPUTS; i++) {
            int user = input.nextInt();
            if (isDistinct(distinctNumbers,user)) {
                distinctNumbers[count] = user;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        for (int i = 0; distinctNumbers[i] != 0; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }

    public static boolean isDistinct(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                return false;
            }
        }
        return true;
    }
}
