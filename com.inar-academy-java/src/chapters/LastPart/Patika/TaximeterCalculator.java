package chapters.LastPart.Patika;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double feePerKm = 2.20;
        double fee = 10;

        System.out.print("Enter the distance you want to go as km: ");
        double d = input.nextDouble();

        fee += d * feePerKm;

        fee = fee >= 20 ? fee : 20;

        System.out.println("Your taximeter amount : " + fee);


    }
}
