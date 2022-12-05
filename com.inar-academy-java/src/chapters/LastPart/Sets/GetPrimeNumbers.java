package chapters.LastPart.Sets;

import java.util.HashSet;
import java.util.Set;

public class GetPrimeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int PRIME_PER_LINE = 10;
        Set<Integer> primes = new HashSet<>();
        primes.add(2);
        int countOfPrimeNumbers = 1;
        int n = 3;

        while (countOfPrimeNumbers < NUMBER_OF_PRIMES) {
            if (isPrime(n)) {
                primes.add(n);
                countOfPrimeNumbers++;
            }
            n += 2;
        }
        displayPrimeNumbers(primes,PRIME_PER_LINE);
    }
    public static boolean isPrime(int n) {
        for (int i = 3; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void displayPrimeNumbers(Set<Integer> set, int primePerLine) {
        for (int i = 0; i < set.size(); i++) {
            System.out.printf("%4s", set.toArray()[i]);
            if ((i + 1) % primePerLine == 0) {
                System.out.println();
            }
        }
    }
}
