package chapters.chapter_06;

public class Exercises_06_26 {
    public static void main(String[] args) {
        final int PALINDROMIC_PRIME_PER_LINE = 10;
        final int NUMBER_OF_PALINDROMIC_PRIME = 100;
    }
    public static int isPrime(int number) {
        number = 2;
        boolean isPrime = true;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0)  {
                isPrime = false;
            }
        }
        return number;
    }
    public static boolean isPalindrome(String number) {
        int low = 0;
        int high = number.length() - 1;
        boolean isPalindrome = true;
        while (low < high) {
            if (number.charAt(low) != number.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        return isPalindrome;
    }

}
