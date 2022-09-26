package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double loan = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,years * 12));
        double totalPayment = monthlyPayment * 12 * years;

        System.out.printf("Monthly Payment: %.2f\nTotal Payment: %.2f",monthlyPayment,totalPayment);
        System.out.println(" ");
        System.out.println("\nPayment#\t  Interest\t   Principal\t    Balance");

        double balance = loan;
        for (int month = 1; month <= 12 * years; month++) {

            double interest = monthlyInterestRate * balance;
            double priciple = monthlyPayment - interest;
            balance -= priciple;

            System.out.printf("%-14d%-13.2f%-17.2f%-14.2f\n", month,interest,priciple,balance);
        }




    }
}
