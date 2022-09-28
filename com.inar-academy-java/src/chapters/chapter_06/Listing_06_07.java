package chapters.chapter_06;

public class Listing_06_07 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    private static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 50;
        int primeCount = 0;
        int number = 2;

        while (primeCount < NUMBER_OF_PRIMES_PER_LINE) {
            if (isPrime(number)) {
                primeCount++;
                System.out.printf("%-4d",number);
                if (primeCount % 10 == 0){
                    System.out.println();
                }

            }
            number++;

        }

    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }


}
