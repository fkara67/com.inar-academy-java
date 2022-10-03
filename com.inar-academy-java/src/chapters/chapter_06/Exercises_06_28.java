package chapters.chapter_06;

public class Exercises_06_28 {
    public static void main(String[] args) {
        final int MERSENNE_PRIME_TILL_N = 31;
        findMersennePrimes(MERSENNE_PRIME_TILL_N);
    }
    public static void findMersennePrimes(int tillN) {
        System.out.println("p\t\t\t\t2^p - 1");
        System.out.println("-----------------------------");
        for (int i = 2; i <= tillN; i++) {
            int num = (int) Math.pow(2,i) - 1;
            if (Exercises_06_27.isPrime(num)) {
                System.out.printf("%-16d%-5d", i, num);
                System.out.println();
            }
        }
    }
}
