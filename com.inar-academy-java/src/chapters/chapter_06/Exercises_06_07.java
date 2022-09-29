package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Years\t FutureValue");

        for (int year = 1; year <= 30; year++) {
            System.out.printf("%-9d", year);
            System.out.printf("%10.2f",
                    futureInvestmentValue(investmentAmount, annualInterestRate / 1200, year));
            System.out.println();
        }

    }
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}
