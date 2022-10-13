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
    public static int[] eliminateDuplicates(int[] numbers) {
        int[] distinctNumbers = new int[numbers.length];
        int countOfDistinct = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isDistinct(distinctNumbers, numbers[i], countOfDistinct)) {
                distinctNumbers[countOfDistinct] = numbers[i];
                countOfDistinct++;
            }
        }
        int[] result = new int[countOfDistinct];
        System.arraycopy(distinctNumbers, 0, result, 0, countOfDistinct);

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
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

}
