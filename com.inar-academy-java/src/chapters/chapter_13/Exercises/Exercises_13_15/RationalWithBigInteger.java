package chapters.chapter_13.Exercises.Exercises_13_15;

import java.math.BigInteger;

public class RationalWithBigInteger extends Number implements Comparable<RationalWithBigInteger> {
    private BigInteger numerator;
    private BigInteger denominator;

    public RationalWithBigInteger() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public RationalWithBigInteger(BigInteger numerator,BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd).multiply
                ((numerator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : new BigInteger("-1"));
        this.denominator = denominator.divide(gcd).abs();
    }

    public double doubleValue() {
        return numerator.divide(denominator).doubleValue();
    }
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }
    public RationalWithBigInteger add(RationalWithBigInteger other) {
        BigInteger n = numerator.multiply(other.getDenominator()).add(denominator.multiply(other.getNumerator()));
        BigInteger d = denominator.multiply(other.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger subtract(RationalWithBigInteger other) {
        BigInteger n = numerator.multiply(other.getDenominator()).subtract(denominator.multiply(other.getNumerator()));
        BigInteger d = denominator.multiply(other.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger multiply(RationalWithBigInteger other) {
        BigInteger n = numerator.multiply(other.getNumerator());
        BigInteger d = denominator.multiply(other.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger divide(RationalWithBigInteger other) {
        BigInteger n = numerator.multiply(other.getDenominator());
        BigInteger d = denominator.multiply(other.getNumerator());
        return new RationalWithBigInteger(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE) || numerator.equals(BigInteger.ZERO)) {
            return numerator + "";
        }
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        return (this.subtract((RationalWithBigInteger) (other))).getNumerator().equals(BigInteger.ZERO);
    }

    @Override
    public int compareTo(RationalWithBigInteger o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0) {
            return 1;
        }
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0) {
            return -1;
        }
        else
            return 0;
    }
}
