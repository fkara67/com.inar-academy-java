package chapters.chapter_10.Exercises.Exercises_10_16;

import java.math.BigInteger;

public class DivisibleBy2Or3 {
    public static void main(String[] args) {
        System.out.println("First 10 fifty digits numbers that are divisible by 2 or 3: ");
        findFirstTen50DigitNumbersDivisibleBy2Or3();

    }

    private static void findFirstTen50DigitNumbersDivisibleBy2Or3() {
        BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000");
        int i = 0;
        while (i < 10) {
            if(num.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    num.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(num);
                i++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}
