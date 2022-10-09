package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        final int NUMBER_OF_INPUTS = 10;
        int[] numbers = new int[NUMBER_OF_INPUTS];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = getTheDistinctNumbers(numbers);
        int count = getCountOfDistinctNumbers(distinctNumbers);

        System.out.println("The number of distinct numbers is " + count);
        System.out.println("The distinct numbers are " + Arrays.toString(distinctNumbers));
    }
    public static int[] getTheDistinctNumbers(int[] numbers, int...distinctNumbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (distinctNumbers[numbers[i]] == 0) {
                distinctNumbers[numbers[i]] = numbers[i];

            }
        }
        return distinctNumbers;
    }
    public static int getCountOfDistinctNumbers(int[] distinctNumbers) {
        int count = 0;
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
