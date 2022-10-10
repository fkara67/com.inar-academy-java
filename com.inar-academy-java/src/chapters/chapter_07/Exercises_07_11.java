package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is %2.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %2.5f", deviation(numbers));

    }
    public static double mean(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean = sum / arr.length;
        return mean;
    }
    public static double deviation(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i] - mean(arr), 2 );
        }
        double deviation = Math.sqrt(sum / (arr.length - 1));
        return deviation;
    }
}
