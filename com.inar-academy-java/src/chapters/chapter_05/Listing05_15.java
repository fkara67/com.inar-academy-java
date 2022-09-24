package chapters.chapter_05;

public class Listing05_15 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int PER_LINE = 10;

        int number = 2, count = 0;
        while(count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % PER_LINE == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");

            }
            number++;

        }

    }
}
