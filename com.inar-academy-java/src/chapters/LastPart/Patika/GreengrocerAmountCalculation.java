package chapters.LastPart.Patika;

import java.util.Scanner;

public class GreengrocerAmountCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double[] prices = {2.14, 3.67, 1.11, 0.95,5};
        String[] vegetables = {"Pear","Apple","Tomato","Banana","Aubergine"};
        for (int i = 0; i < prices.length; i++) {
            System.out.print(vegetables[i] + " How Many Kg: ");
            total += input.nextDouble() * prices[i];
        }
        System.out.println("Total amount: " + total);
    }
}
