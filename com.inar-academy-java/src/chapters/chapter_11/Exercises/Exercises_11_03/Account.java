package chapters.chapter_11.Exercises.Exercises_11_03;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }
    // constructor that creates an account with the specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public String toString() {
        return "---------------------------------" +
                "\nClass Name: Account\nid: " + getId() +
                "\nBalance: " + getBalance() +
                "\nAnnual Interest Rate: " + getAnnualInterestRate() +
                "\nDate Created: " + getDateCreated() +
                "\n--------------------------------";
    }

    //accessor and mutator methods for id, balance, and annualInterestRate.
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 1200;
    }
    //Monthly interest is balance * monthlyInterestRate.
    public double getMonthlyInterest() {
       return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}
