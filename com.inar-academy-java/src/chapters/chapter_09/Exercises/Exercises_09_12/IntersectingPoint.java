package chapters.chapter_09.Exercises.Exercises_09_12;

import chapters.chapter_09.Exercises.Exercises_09_11.LinearEquation;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        double[][] points = new double[4][2];
        fillArrWithInput(points);
        displayIntersectingPoint(points);
    }
    public static void fillArrWithInput(double[][] arr) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
    }
    //(y1 - y2)x + (x2 - x1)y = (y1 - y2)x1 + (x2 - x1)y1
    //(y3 - y4)x + (x4 - x3)y = (y3 - y4)x3 + (x4 - x3)y3
    public static void displayIntersectingPoint(double[][] points) {
        double a = points[0][1] - points[1][1];
        double b = points[1][0] - points[0][0];
        double c = points[2][1] - points[3][1];
        double d = points[3][0] - points[2][0];
        double e = a * points[0][0] + b * points[0][1];
        double f = c * points[2][0] + d * points[2][1];

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.printf("The intersecting point is at (%2.5f , %2.4f)", equation.getX() , equation.getY());
        }
        else {
            System.out.println("The two lines are parallel");
        }
    }
}
