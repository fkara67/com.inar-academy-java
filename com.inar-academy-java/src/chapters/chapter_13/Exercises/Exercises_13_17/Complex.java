package chapters.chapter_13.Exercises.Exercises_13_17;

public class Complex implements Cloneable {
    private double a;
    private double b;

    public Complex() {
        this(0,0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public String toString() {
        if (b == 0) {
            return a + "";
        }
        else if (a == 0) {
            return b + "i";
        }
        return a + " + " + b + "i";
    }

    public Complex add(Complex o) {
        return new Complex(a + o.getRealPart(), b + o.getImaginaryPart());
    }

    public Complex subtract(Complex o) {
        return new Complex(a - o.getRealPart(), b - o.getImaginaryPart());
    }

    public Complex multiply(Complex o) {
        return new Complex(a * o.getRealPart() - b * o.getImaginaryPart(),
                b * o.getRealPart() + a * o.getImaginaryPart());
    }

    public Complex divide(Complex o) {
        return new Complex((a * o.getRealPart() + b * o.getImaginaryPart()) /
                (Math.pow(o.getRealPart(), 2) + Math.pow(o.getImaginaryPart(), 2)),
                (b * o.getRealPart() - a * o.getImaginaryPart()) /
                 (Math.pow(o.getRealPart(), 2) + Math.pow(o.getImaginaryPart(), 2)));
    }
    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public Complex clone() {
        try {
            return (Complex) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
