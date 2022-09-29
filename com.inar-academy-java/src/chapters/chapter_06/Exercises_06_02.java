package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The sum of the digits of integer " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        int remainningDigits = n;
        while (remainningDigits != 0) {
            sumOfDigits += remainningDigits % 10;
            remainningDigits /= 10;
        }
        return sumOfDigits;
    }
}
