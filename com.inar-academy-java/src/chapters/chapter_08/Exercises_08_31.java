package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_31 {
    /* Geometry: intersecting point
        1- prompt the user to enter four points
        2- fill these points into two-dim arr
        3- display the intersecting point or situation of parallel
     */
    public static void main(String[] args) {
        //this array for points
        double[][] p = new double[4][2];
        System.out.print("Enter four points(x,y): ");
        fillArrayWithInput(p);

        // keep the intersecting points in this arr
        double[] intersectingPoint = getIntersectingPoint(p);

        // display the results
        if (intersectingPoint == null) {
            System.out.println("The two lines are parallel");
        }
        else {
            System.out.printf("The intersecting point is at (%4.4f, %4.4f)",intersectingPoint[0], intersectingPoint[1]);
        }
    }
    public static void fillArrayWithInput(double[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
    }
    public static double[] getIntersectingPoint(double[][] points) {
        double[][] a = {{points[0][1] - points[1][1], points[1][0] - points[0][0]},
                {points[2][1] - points[3][1], points[3][0] - points[2][0]} };

        double[] b = new double[2];
        b[0] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        b[1] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        double[] result = Exercises_08_30.linearEquation(a,b);

        return result;

    }
}
