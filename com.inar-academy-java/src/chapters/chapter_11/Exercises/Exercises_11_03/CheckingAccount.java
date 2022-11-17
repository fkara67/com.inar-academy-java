package chapters.chapter_11.Exercises.Exercises_11_03;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        overdraftLimit = 1000;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (getBalance() - amount >= - overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("You don't have enough limit in your checking account!");
    }
    public String toString() {
        return "---------------------------------" +
                "\nClass Name: CheckingAccount\nid: " + getId() +
                "\nBalance: " + getBalance() +
                "\nAnnual Interest Rate: " + getAnnualInterestRate() +
                "\nDate Created: " + getDateCreated() +
                "\n--------------------------------";
    }
}
