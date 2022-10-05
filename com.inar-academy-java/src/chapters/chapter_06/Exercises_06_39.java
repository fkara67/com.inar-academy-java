package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("(" + x2 + "," + y2 + ") is on the ");

        if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.print("left side of the line from ");

        else if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.print("line segment from ");

        else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.print("same line from ");

        else System.out.print("rigth side of the line from ");

        System.out.print("(" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");



    }
    public static double positionControl(double x0,double y0,double x1,double y1,double x2,double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return positionControl(x0, y0, x1, y1, x2, y2) > 0;
    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return positionControl(x0, y0, x1, y1, x2, y2) == 0;
    }
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (positionControl(x0, y0, x1, y1, x2, y2) == 0 && (x2 > x0) && (y2 > y0) && (y2 < y1) && (x2 < x1));
    }
}
