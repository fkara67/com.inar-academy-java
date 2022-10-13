package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_03 {
    public static void main(String[] args) {

        System.out.print("Enter the integers between 1 and 100 (0 ends the input): ");
        Scanner input = new Scanner(System.in);
        int[] occurrences = new int[100];

        // Count the occurrences of each number
        int n = input.nextInt();
        while (n != 0) {
            occurrences[n]++;
            n = input.nextInt();
        }

        // Display counts
        displayCounts(occurrences);
    }
    public static void displayCounts(int[] counts) {
        System.out.println("The occurrences of each integer are:");
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((i) + " occurs " + counts[i] +
                        ((counts[i] > 1) ? " times" : " time"));
            }
        }
    }


}
