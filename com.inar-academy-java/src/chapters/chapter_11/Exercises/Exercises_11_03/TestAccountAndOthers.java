package chapters.chapter_11.Exercises.Exercises_11_03;

public class TestAccountAndOthers {
    public static void main(String[] args) {
        Account account = new Account(111, 1000);
        SavingsAccount savingsAccount = new SavingsAccount(222,1000);
        CheckingAccount checkingAccount = new CheckingAccount(333, 1000, 1000);

        checkingAccount.withdraw(2001);
        savingsAccount.withdraw(1001);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}
