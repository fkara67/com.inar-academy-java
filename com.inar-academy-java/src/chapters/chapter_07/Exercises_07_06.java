package chapters.chapter_07;

public class Exercises_07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int PRIME_PER_LINE = 10;
        int[] primeNumbers = new int[NUMBER_OF_PRIMES];

        int countOfPrimeNumbers = 0;
        int n = 2;
        int index = 0;
        while (countOfPrimeNumbers < NUMBER_OF_PRIMES) {
            if (isPrime(n)) {
                primeNumbers[index] = n;
                countOfPrimeNumbers++;
                index++;
            }
            n++;
        }
        displayPrimeNumbers(primeNumbers,PRIME_PER_LINE);

    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void displayPrimeNumbers(int[] primeNumbers, int perLine) {
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%4d", primeNumbers[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
