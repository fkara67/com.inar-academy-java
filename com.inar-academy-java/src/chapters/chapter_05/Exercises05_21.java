package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Loan Amount: ");
        double loan = input.nextDouble();
        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        System.out.println("Interest Rate\t Monthly Payment\t Total Payment");
        for (double annualInterestRate = 5.000; annualInterestRate <= 8.000; annualInterestRate += 0.125) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1+monthlyInterestRate,years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%-5.3f", annualInterestRate);
            System.out.print("%           ");
            System.out.printf("%-20.2f%-12.2f\n",monthlyPayment,totalPayment);

        }
    }
}
