package chapters.LastPart.Patika;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double kdvRate = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an amount of money: ");
        double amount = input.nextDouble();
        if (amount > 0 && amount <= 1000) {
            kdvRate = 0.18;
        } else if (amount > 1000) {
            kdvRate = 0.08;
        }

        double kdv = amount * kdvRate;
        double amountWithKdv = amount + kdv;

        System.out.println("Amount without KDV: " + amount);
        System.out.println("Amount with KDV: " + amountWithKdv);
        System.out.println("Amount of KDV: " + kdv);
    }
}
