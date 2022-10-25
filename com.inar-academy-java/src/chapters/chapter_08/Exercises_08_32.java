package chapters.chapter_08;

public class Exercises_08_32 {
    /* Geometry: area of a triangle
        1- prompt the user to enter three points of a triangle
        2- store the points a 3-by-2 two-dim arr
        3- display the area of the triangle
        4- if three points are on the same line return 0
     */
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        Exercises_08_31.fillArrayWithInput(points);
        if ( getTriangleArea(points) == 0) {
            System.out.println("The three points are on the same line");
        }
        else {
            System.out.printf("The area of the triangle is %.2f", getTriangleArea(points));
        }
    }
    public static double getTriangleArea(double[][] points) {
        if (((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
                (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0)) {
            return 0;
        }
        double side1 = computeDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
        double side2 = computeDistance(points[0][0], points[0][1], points[2][0], points[2][1]);
        double side3 = computeDistance(points[1][0], points[1][1], points[2][0], points[2][1]);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public static double computeDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
