package chapters.chapter_08;

public class Exercises_08_07 {
    /*  Given a set of points, the problem is to find the two points that are nearest
     to each other
     */
    public static void main(String[] args) {
        double[][] points = { {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9},
                              {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},{5.5, 4, -0.5} };
        displayNearestPoints(points);
    }
    public static void displayNearestPoints(double[][] points) {
        double shortestDistance = Double.MAX_VALUE;
        int p1 = -1;
        int p2 = -1;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = computeDistance(points[i][0], points[i][1],points[i][2],
                                                points[j][0], points[j][1], points[j][2]);
                if (shortestDistance > distance) {
                    shortestDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("The closest two points are (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2]
                + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] +  ")");
    }
    public static double computeDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2) + Math.pow(z2 - z1,2));
    }
}
