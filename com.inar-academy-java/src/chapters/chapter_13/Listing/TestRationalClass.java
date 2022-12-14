package chapters.chapter_13.Listing;

public class TestRationalClass {
    public static void main(String[] args) {

        // Create and initialize two rational numbers r1 and r2
        Rational r1 = new Rational(-4,5);
        Rational r2 = new Rational(2,3);
        System.out.println("r1 is " + r1);

        System.out.println(r1 + " + " + r2 + " is " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " is " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " is " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " is " + r1.divide(r2));

        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
