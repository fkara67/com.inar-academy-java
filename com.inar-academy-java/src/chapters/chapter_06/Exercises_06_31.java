package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        System.out.println(number + (isValid(number) ? " is valid" : " is invalid"));
    }

    public static boolean isValid(long number) {
        boolean isValid =
         (((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) &&
                (13 <= getSize(number) && getSize(number) >= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 6) || prefixMatched(number, 37)));
        return isValid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String s = number + "";
        int sum = 0;
        for (int i = s.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(2 * Integer.parseInt(s.substring(i, i + 1)));
        }
        return sum;
    }

    public static int getDigit(int num) {

        if (num <= 9) {
            return num;
        } else
            return (num % 10) + (num / 10);
    }

    public static int sumOfOddPlace(long number) {
        String s = number + "";
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return sum;
    }

    public static int getSize(long d) {
        String s = d + "";
        int size = s.length();
        return size;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static long getPrefix(long number, int k) {
        String s = number + "";
        if (getSize(number) > k) {
            return Long.parseLong(s.substring(0, k));
        }
        return number;
    }
}
