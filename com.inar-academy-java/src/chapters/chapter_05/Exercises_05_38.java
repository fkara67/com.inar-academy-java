package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int decimal = input.nextInt();

        String octal = "";

        for ( int i = decimal; i > 0; i /= 8) {
            octal = (i % 8) + octal;
        }
        System.out.println("Octal correspond of decimal " + decimal + " is " + octal);
    }
}
