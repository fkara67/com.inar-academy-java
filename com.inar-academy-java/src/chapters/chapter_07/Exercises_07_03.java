package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100 (0 ends the input): ");
        int count = 0;
        String s = "";
        do {
            s += input.next();
            count++;
            }while (input.nextInt() != 0);
        int[] numbers = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            numbers[i] = Integer.parseInt(s.substring(i,i + 1));

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
            System.out.print(numbers[i] + " ");
            if ((i+1) % 10 == 0)
                System.out.println();

        }
    }
    public static void displayCounts(int[] counts, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " occurs " + counts[numbers[i]] +
                    ((counts[numbers[i]] > 1) ? " times" : " time") + "\n");

        }
    }
}
