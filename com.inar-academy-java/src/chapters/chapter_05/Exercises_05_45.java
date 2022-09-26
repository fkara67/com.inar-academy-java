package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double sumOfNumbers = 0;
        double sumOfSquares = 0;
        for (int i = 0; i < 10; i++) {
            double number = input.nextDouble();
            sumOfNumbers += number;
            sumOfSquares += number * number;
        }
        double mean = sumOfNumbers / 10;
        double deviation = Math.sqrt((sumOfSquares - (Math.pow(sumOfNumbers,2) / 10)) / 9);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
    }
}
