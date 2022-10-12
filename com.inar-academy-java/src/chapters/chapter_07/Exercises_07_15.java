package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_15 {
    public static void main(String[] args) {
        final int NUMBER_OF_INPUTS = 10;
        System.out.print("Enter " + NUMBER_OF_INPUTS + " numbers: ");
        int[] numbers = createArrayWithInput(NUMBER_OF_INPUTS);

        int[] result = eliminateDuplicates(numbers);
        displayDistinctNumbers(result);

    }
    public static int[] eliminateDuplicates(int[] arr) {
        int[] distinctNumbers = new int[arr.length];
        int countOfDistinct = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isDistinct(distinctNumbers, arr[i], countOfDistinct)) {
                distinctNumbers[countOfDistinct] = arr[i];
                countOfDistinct++;
            }
        }
        int[] result = new int[countOfDistinct];
        for (int i = 0; i < countOfDistinct; i++) {
            result[i] = distinctNumbers[i];
        }

        return result;

    }
    public static boolean isDistinct(int[] distinctNumbers, int n, int count) {
        for (int i = 0; i < count; i++) {
            if (n == distinctNumbers[i]) {
                return false;
            }
        }
        return true;
    }
    public static int[] createArrayWithInput(int numberOfInputs) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[numberOfInputs];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public static void displayDistinctNumbers(int[] result) {
        System.out.println("The distinct numbers are ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
