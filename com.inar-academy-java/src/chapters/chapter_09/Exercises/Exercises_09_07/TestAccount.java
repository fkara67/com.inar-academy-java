package chapters.chapter_09.Exercises.Exercises_09_07;

public class TestAccount {
    /* Write a test program that creates an Account object with an account ID of 1122,
      a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
      method to withdraw $2,500, use the deposit method to deposit $3,000, and print
      the balance, the monthly interest, and the date when this account was created.
     */
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.print("Balance\t\tMonthly Interest\t\tAccount Create Date\n");
        System.out.println("--------------------------------------------------------");
        System.out.print(account1.getBalance() + "\t\t" + account1.getMonthlyInterest() + "\t\t\t\t" + account1.getDateCreated());
    }
}
