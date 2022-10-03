package chapters.chapter_06;

public class Exercises_06_29 {
    public static void main(String[] args) {
        final int NUMBER_OF_TWIN_PRIME_TILL = 1000;
        printTwinPrimes(NUMBER_OF_TWIN_PRIME_TILL);

    }
    public static void printTwinPrimes(int numberOfTwinPrimesTill) {
        int number = 2;
        while (number < numberOfTwinPrimesTill) {
            if (Exercises_06_27.isPrime(number)) {
                if (Exercises_06_27.isPrime(number + 2)) {
                    System.out.println("(" + number + ", " + (number + 2) + ")");
                }
            }
            number++;
        }
    }
}
