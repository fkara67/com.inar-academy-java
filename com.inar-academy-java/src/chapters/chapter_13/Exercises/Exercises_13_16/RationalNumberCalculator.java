package chapters.chapter_13.Exercises.Exercises_13_16;

public class RationalNumberCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java RationalNumberCalculator operand1 operator operand2");
            System.exit(1);
        }

        int numerator1;
        int denominator1;
        int numerator2;
        int denominator2;

        String[] list = args[0].split("/");
        if (!args[0].contains("/")) {
            numerator1 = Integer.parseInt(list[0]);
            denominator1 = 1;
        }
        else {
            numerator1 = Integer.parseInt(list[0]);
            denominator1 = Integer.parseInt(list[1]);
        }

        list = args[2].split("/");
        if (!args[2].contains("/")) {
            numerator2 = Integer.parseInt(list[0]);
            denominator2 = 1;
        }
        else {
            numerator2 = Integer.parseInt(list[0]);
            denominator2 = Integer.parseInt(list[1]);
        }

        Rational2 r1 = new Rational2(numerator1, denominator1);
        Rational2 r2 = new Rational2(numerator2, denominator2);

        Rational2 result = new Rational2();
        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = r1.add(r2);
                break;
            case '-':
                result = r1.subtract(r2);
                break;
            case '.':
                result = r1.multiply(r2);
                break;
            case '/':
                result = r1.divide(r2);
        }
        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}

class Rational2 extends Number implements Comparable<Rational2> {
    private long numerator;
    private long denominator;

    /**
     * Construct a rational with default properties
     */
    public Rational2() {
        this(0, 1);
    }

    public Rational2(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((numerator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator / gcd);
    }

    // Implement the abstract floatValue, intValue, longValue, doubleValue method in Number
    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    /**
     * Find GCD of two numbers
     */
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
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational2 add(Rational2 secondRational) {
        long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational2(n, d);
    }

    public Rational2 subtract(Rational2 secondRational) {
        long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational2(n, d);
    }

    public Rational2 multiply(Rational2 secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational2(n, d);
    }

    public Rational2 divide(Rational2 secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational2(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1 || numerator == 0) {
            return numerator + "";
        } else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        return (this.subtract((Rational2) (other))).getNumerator() == 0;
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational2 o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else
            return 0;
    }
}
