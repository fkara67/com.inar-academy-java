package chapters.chapter_13.Exercises.Exercises_13_20;

import chapters.chapter_13.Exercises.Exercises_13_17.Complex;

import java.util.Scanner;

public class SolveQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c (for ax²+bx+c=0 statement): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        Object[] roots = findRoots(a, b, discriminant);

        displayResult(discriminant,roots[0], roots[1]);
    }
    public static void displayResult(double discriminant, Object r1, Object r2) {
        if (discriminant > 0) {
            System.out.printf("The equation has two roots: %.4f and %.4f",(double) r1,(double) r2);
        }
        if (discriminant == 0) {
            System.out.printf("The equation has one root: %.1f", (double)r1);
        }
        if (discriminant < 0) {
            System.out.print("The equation has two imaginary roots: " + r1 + " and " + r2);
        }
    }
    public static Object[] findRoots(double a, double b, double discriminant) {
        Object r1;
        Object r2;
        if (discriminant >= 0) {
            r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
        }
        else {
            r1 = new Complex( b / (2 * a) * -1, (Math.sqrt(Math.abs(discriminant)) / (2 * a)));
            r2 = new Complex( b / (2 * a) * -1, (Math.sqrt(Math.abs(discriminant)) / (2 * a)) * -1);
        }
        return new Object[]{r1, r2};
    }
}
