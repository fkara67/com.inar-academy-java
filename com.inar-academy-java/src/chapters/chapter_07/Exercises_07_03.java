package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_03 {
    public static void main(String[] args) {

        System.out.print("Enter the integers between 1 and 100 (0 ends the input): ");
        Scanner input = new Scanner(System.in);
        final int MAXIMUM_NUMBER_OF_INPUT = 250;
        int[] numbers = new int[MAXIMUM_NUMBER_OF_INPUT];
        int element = -1;
        for (int i = 0; element != 0; i++) {

            element = input.nextInt();
            numbers[i] = element;
        }


        // Display the array
        System.out.println("The integers are:");
        displayArray(numbers);

        // Count the occurrences of each letter
        int[] counts = countIntegers(numbers);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each integer are:");
        displayCounts(counts, numbers);
    }
    public static int[] countIntegers(int[] numbers) {
        int[] counts = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }
        return counts;
    }
    public static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
                if ((i + 1) % 10 == 0)
                    System.out.println();
            }

        }
    }
    public static void displayCounts(int[] counts, int[] numbers) {

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.print((i) + " occurs " + counts[i] +
                        ((counts[i] > 1) ? " times" : " time") + "\n");
            }

        }
    }


}
