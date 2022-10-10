package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] result = eliminateDuplicates(numbers);
        System.out.println("The distinct numbers are ");
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + " ");
            }
        }
    }
    public static int[] eliminateDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isDistinct(result, arr[i]))
                result[i] = arr[i];
        }
        return result;
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
