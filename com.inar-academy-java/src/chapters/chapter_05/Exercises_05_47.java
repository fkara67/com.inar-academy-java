package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String first12Digits = input.nextLine();
        int inside = 0;
        int checksum = 0;
        if (first12Digits.length() != 12){
            System.out.println(first12Digits + " is an invalid input");
            System.exit(1);
        }

        for (int i = 0; i < first12Digits.length(); i += 2) {
            inside += Integer.parseInt(first12Digits.substring(i,i+1)) +
                    3 * Integer.parseInt(first12Digits.substring(i+1,i+2));
        }
        checksum = 10 - (inside % 10);
        if (checksum == 10) {
            System.out.println("The ISBN-13 number is " + first12Digits + 0);
        }
        else
            System.out.println("The ISBN-13 number is " + first12Digits + checksum);
    }
}
