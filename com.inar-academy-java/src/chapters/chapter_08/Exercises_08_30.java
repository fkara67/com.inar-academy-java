package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_30 {
    /* Algebra: solve linear equations
        1- prompt the user to enter a00, a01, a10, a11, b0 and b1
        2- display the result
        3- if a00a11 - a01a10 is 0, report that “The equation has no solution.”
     */
    public static void main(String[] args) {

        System.out.print("Enter a00, a01, a10, a11: ");
        double[][] a = new double[2][2];
        fillWithInput(a);
        System.out.print("Enter b0 and b1: ");
        double[] b = new double[2];
        fillWithInput(b);
        double[] result = linearEquation(a,b);
        if (linearEquation(a,b) == null)
            System.out.println("The equation has no solution.");
        else
            System.out.println("x is " + result[0] + " y is " + result[1]);
    }
    public static void fillWithInput(double[][] a) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
    }
    public static void fillWithInput(double[] b) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }
    }
    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];
        if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0) {
            return null;
        }
        result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        return result;
    }
}
