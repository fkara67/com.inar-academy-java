package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount (e.g. 100): ");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate (e.g. 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter number of months (e.g. 6): ");
        int numberOfMonths = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200;
        double newAmount = 0;
        for (int i = 1; i <= numberOfMonths; i++) {
            newAmount = (amount + newAmount) * (1 + monthlyInterestRate);
        }
        System.out.println("After " + numberOfMonths + "months later the value in the account becomes ");
        System.out.printf("%.2f",newAmount);

    }
}
