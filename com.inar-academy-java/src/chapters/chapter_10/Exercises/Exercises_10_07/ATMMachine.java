package chapters.chapter_10.Exercises.Exercises_10_07;

import chapters.chapter_09.Exercises.Exercises_09_07.Account;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
        Scanner input = new Scanner(System.in);

        while(true) {
            int choice = -1;
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            while (id < 0 || id > 9) {
                System.out.print("Incorrect id! Enter a correct id: ");
                id = input.nextInt();
            }
            while (choice != 4) {
                displayMainMenu();
                System.out.print("\nEnter a choice: ");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                }
                else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    double amount = input.nextDouble();
                    accounts[id].withdraw(amount);
                }
                else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    double amount = input.nextDouble();
                    accounts[id].deposit(amount);
                }
            }
        }

    }
    public static void displayMainMenu() {
        System.out.println("");
        System.out.print("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
    }
}
