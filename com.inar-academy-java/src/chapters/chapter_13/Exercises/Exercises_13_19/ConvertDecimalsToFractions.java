package chapters.chapter_13.Exercises.Exercises_13_19;

import chapters.chapter_13.Exercises.Exercises_13_15.RationalWithBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class ConvertDecimalsToFractions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimal = input.next();

        String[] parts = decimal.split("\\.");
        if (parts.length == 2) {
            String all = parts[0] + parts[1];
            RationalWithBigInteger r = new RationalWithBigInteger(new BigInteger(all),
                    new BigInteger((int) Math.pow(10,parts[1].length()) + ""));
            System.out.println("The fraction number is " + r);
        }
        else
            System.out.println("The fraction number is " + Integer.parseInt(parts[0]));

        BigInteger a = new BigInteger("-325");
    }
}
