package chapters.chapter_10.Exercises.Exercises_10_15;

import chapters.chapter_10.Exercises.Exercises_10_13.MyRectangle2D;

import java.util.Scanner;

public class BoundingRectangle {
    public static void main(String[] args) {
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        fillArrWithInput(points);
        MyRectangle2D r1 = getRectangle(points);

        System.out.println("The bounding rectangle's center (" + r1.getX() +
                "," + r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
    }

    public static void fillArrWithInput(double[][] points) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double minY = points[0][1];
        double maxX = points[0][0];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (minX > points[i][0])
                minX = points[i][0];
            if (minY > points[i][1])
                minY = points[i][1];
            if (maxX < points[i][0])
                maxX = points[i][0];
            if (maxY < points[i][1])
                maxY = points[i][1];
        }
        double width = maxX - minX;
        double height = maxY - minY;
        double x = maxX - (width / 2);
        double y = maxY - (height / 2);

        return new MyRectangle2D(x, y, width, height);
    }
}
