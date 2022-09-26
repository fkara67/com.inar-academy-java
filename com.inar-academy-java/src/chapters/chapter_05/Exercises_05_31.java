package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter annual percentage yield (e.g. 5): ");
        double annualPercentage = input.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        int months = input.nextInt();
        System.out.println("Month\tCD Value");

        double monthlyPercentage = annualPercentage / 1200;
        double cdValue = amount;
        for (int i = 1; i <= months; i++) {
            cdValue = cdValue + cdValue * monthlyPercentage;
            System.out.printf("%-8d%5.2f\n", i, cdValue);

        }
    }
}
