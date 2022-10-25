package chapters.chapter_08;

import java.util.Arrays;

public class Exercises_08_33 {
    /* Geometry: polygon subareas
        1- prompt the user to enter the coordinates of four vertices
        2- store the coordinates in a 4-2 two-dim arr
        3- store the subAreas in single-dim arr
        4- display the areas of the four triangles in increasing order.
     */
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] vertices = new double[4][2];
        double[][] intSec = {vertices[0], vertices[2],vertices[1],vertices[3]};
        Exercises_08_31.fillArrayWithInput(vertices);
        double[] intSecPoint = Exercises_08_31.getIntersectingPoint(intSec);
        System.out.println(Arrays.toString(intSecPoint));
        double[] areas = new double[4];
        double[][][] points = {
                {vertices[0],vertices[1],intSecPoint},
                {vertices[0],vertices[3],intSecPoint},
                {vertices[2],vertices[3],intSecPoint},
                {vertices[1],vertices[2],intSecPoint} };

        for (int i = 0; i < areas.length; i++) {
            areas[i] = Exercises_08_32.getTriangleArea(points[i]);
        }
        sort(areas);
        display(areas);
    }
    public static void sort(double[] areas) {
        for (int i = 0; i < areas.length - 1; i++) {
            for (int j = i + 1; j < areas.length; j++) {
                if (areas[i] > areas[j]) {
                    double temp = areas[i];
                    areas[i] = areas[j];
                    areas[j] = temp;
                }
            }
        }
    }
    public static void display(double[] areas) {
        System.out.print("The areas are ");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%5.2f",areas[i]);
        }
    }

}
