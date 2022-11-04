package chapters.chapter_09.Exercises.Exercises_09_10;
 // quadratic equation ax2 + bx + x = 0
public class QuadraticEquation {
    // Private data fields a, b, and c that represent three coefficients.
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    // A constructor for the arguments for a, b, and c.
    public QuadraticEquation(double a, double b, double c) {
         this.a = a;
         this.b = b;
         this.c = c;
     }
     public double getDiscriminant() {
        return b * b - 4 * a * c ;
     }
     public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
     }
     public double getRoot2() {
         if (getDiscriminant() < 0) {
             return 0;
         }
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
     }
     public double getA() {
        return a;
     }
     public double getB() {
        return b;
     }
     public double getC() {
        return c;
     }
}
