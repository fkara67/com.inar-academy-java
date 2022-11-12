package chapters.chapter_10.Exercises.Exercises_10_19;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {
        System.out.print("p\t\t2^p - 1\n");
        BigInteger a = new BigInteger("3");

        for (int p = 2; p <= 100; p++) {
            BigInteger b = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
            if (isPrime(b)) {
                System.out.printf("%-8d%-8d\n", p, b);
            }
        }
    }
    public static boolean isPrime(BigInteger b) {
        BigInteger divisor = new BigInteger("3");
        while (divisor.compareTo(b.divide(new BigInteger("2"))) <= 0) {
            if (b.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
            divisor = divisor.add(new BigInteger("2"));
        }
        return true;
    }
}
