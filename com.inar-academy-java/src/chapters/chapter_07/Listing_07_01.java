package chapters.chapter_07;

import java.util.Scanner;

public class Listing_07_01 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of input: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;

        int countOfAboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                countOfAboveAverage++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("The number of elements above the average is " + countOfAboveAverage);

    }
}
