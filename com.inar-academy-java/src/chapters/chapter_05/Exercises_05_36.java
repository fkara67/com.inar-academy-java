package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first nine digits of an ISBN: ");
        String first9 = input.next();

        int checksum = 0;
        int sum = 0;

        if (first9.length() < 9 || first9.length() > 9) {
            System.out.println("Invalid input!");
            System.exit(0);
        }
        for (int i = 0; i < first9.length(); i++) {

            sum += Integer.parseInt(first9.substring(i,i+1)) * (i+1);
        }
        checksum = sum % 11;
        if (checksum == 10) {
            System.out.println("The ISBN-10 number is " + first9 + "X" );
        }
        else {
            System.out.println("The ISBN-10 number is " + first9 + checksum);
        }
    }
}
