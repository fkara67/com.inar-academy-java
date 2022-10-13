package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_25 {
    /* 1-prompt the user to enter coefficients of a quadratic equation
        ax² + bx + c = 0;
        2- pass a, b and c in a array(eqn)
        3- store the real roots in another array(roots)
        4- display number of real roots
        5- display real roots
     */
    public static void main(String[] args) {
        System.out.print("Please enter the coefficients(a, b and c): ");

        double[] eqn = getCoefficientsFromUser();
        double[] roots = new double[2];
        int numberOfRealRoots = solveQuadratic(eqn,roots);
        displayRoots(roots, numberOfRealRoots);
    }
    public static double[] getCoefficientsFromUser() {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        return eqn;
    }
    public static int solveQuadratic(double[] eqn, double[] roots) {
        int numberOfRealRoots;
        double discriminant = Math.sqrt(eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2]);
        if (discriminant == 0) {
            numberOfRealRoots = 1;
            roots[0] = (-eqn[1] + discriminant) / (2 * eqn[0]);
        } else if (discriminant > 0) {
            numberOfRealRoots = 2;
            roots[0] = (-eqn[1] + discriminant) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - discriminant) / (2 * eqn[0]);
        }
        else numberOfRealRoots = 0;

        return numberOfRealRoots;
    }
    public static void displayRoots(double[] roots, int numberOfRoots) {
        if (numberOfRoots == 0) {
            System.out.println("The equation has no real roots");
        } else if (numberOfRoots == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        }
        else System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
    }
}
