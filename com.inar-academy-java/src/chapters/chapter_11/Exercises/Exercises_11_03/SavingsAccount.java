package chapters.chapter_11.Exercises.Exercises_11_03;

public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("You don't have enough money in your saving account!");
    }
    public String toString() {
        return "---------------------------------" +
                "\nClass Name: SavingAccount\nid: " + getId() +
                "\nBalance: " + getBalance() +
                "\nAnnual Interest Rate: " + getAnnualInterestRate() +
                "\nDate Created: " + getDateCreated() +
                "\n--------------------------------";
    }
}
