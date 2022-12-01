package chapters.chapter_13.Exercises.Exercises_13_14;

import chapters.chapter_13.Listing.Rational;

public class RationalNew extends Number implements Comparable<Rational> {
    private long[] r = new long[2];

    /** Construct a rational with default properties */
    public RationalNew() {
        this(0 , 1);
    }
    public RationalNew(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.r[0] = ((numerator > 0) ? 1 : -1) * numerator / gcd;
        this.r[1] = Math.abs(denominator / gcd);
    }

    // Implement the abstract floatValue, intValue, longValue, doubleValue method in Number
    @Override
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

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }

    /** Find GCD of two numbers */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && (n2 % k == 0)) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }
    public Rational add(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }
    public Rational subtract(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }
    public Rational multiply(Rational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }
    public Rational divide(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();
        return new Rational(n, d);
    }
    @Override
    public String toString() {
        if (r[1] == 1 || r[0] == 0) {
            return r[0] + "";
        }
        else
            return r[0] + "/" + r[1];
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        return (this.subtract((Rational) (other))).getNumerator() == 0;
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        }
        else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        }
        else
            return 0;
    }
}
