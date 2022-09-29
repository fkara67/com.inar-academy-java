package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();


            System.out.println("Integer " + number + ((isPalindrome(number)) ? " is " : " is not ") + "a palindrome.");


    }
    public static int reverse(int number) {
        String s = "" + number;
        int reversedNumber = 0;
        for (int i = 0; i + 1 <= s.length(); i++) {
            reversedNumber += Integer.parseInt(s.substring(i,i+1)) * Math.pow(10,i);
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int number) {
        return (number == reverse(number)) ? true : false;
    }
}
