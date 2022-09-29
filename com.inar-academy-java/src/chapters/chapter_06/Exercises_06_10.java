package chapters.chapter_06;

public class Exercises_06_10 {
    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 10000; i > 0; i--) {
            if (Listing_06_07.isPrime(i)) {
                primeCount++;
                System.out.printf("%6d",i);
                if (primeCount % 20 == 0)
                    System.out.println();
            }
        }
    }
}
