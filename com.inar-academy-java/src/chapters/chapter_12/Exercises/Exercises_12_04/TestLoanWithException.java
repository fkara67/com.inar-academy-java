package chapters.chapter_12.Exercises.Exercises_12_04;

import java.util.Scanner;

public class TestLoanWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter annual interest rate: ");
            double annualInterestRate = input.nextDouble();

            System.out.print("Enter number of years: ");
            int numberOfYears = input.nextInt();

            System.out.print("Enter loan amount: ");
            double loanAmount = input.nextDouble();

            try {
                // Create a Loan object
                LoanWithException loan = new LoanWithException(annualInterestRate, numberOfYears, loanAmount);
                // Display loan date, monthly payment, and total payment
                System.out.printf("\nThe loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n",
                        loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
                break;
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                input.nextLine();
            }
        }
    }
}
