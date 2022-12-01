package chapters.chapter_13.Exercises.Exercises_13_15;

import java.math.BigInteger;

public class TestRationalWithBigInteger {
    public static void main(String[] args) {
        RationalWithBigInteger o = new RationalWithBigInteger(BigInteger.ONE, new BigInteger("2"));
        RationalWithBigInteger a = new RationalWithBigInteger(new BigInteger("3"), new BigInteger("2"));
        RationalWithBigInteger b = new RationalWithBigInteger(BigInteger.ONE, new BigInteger("2"));
        RationalWithBigInteger c = new RationalWithBigInteger(new BigInteger("5"), new BigInteger("6"));

        System.out.println(o.add(b));
        System.out.println(c.add(a));
        System.out.println(a.subtract(c));
        System.out.println(b.multiply(c));
        System.out.println(a.divide(o));
    }
}
