package chapters.chapter_11.Exercises.Exercises_11_15;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfAConvexPolygon {
    public static void main(String[] args) {
        System.out.print("Enter the number of the points: ");
        Scanner input = new Scanner(System.in);
        int numberOfPoints = input.nextInt();
        ArrayList<Double> points = new ArrayList<>();

        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < 2 * numberOfPoints; i++) {
            points.add(input.nextDouble());
        }
        System.out.println("Total area is: " + computeArea(points));

    }
    public static double computeArea(ArrayList<Double> points) {
        double toRight = 0;
        for (int i = points.size() - 2; i >= 2; i -= 2) {
            toRight += points.get(i) * points.get(i - 1);
        }
        toRight += points.get(0) * points.get(points.size() - 1);

        double toLeft = 0;
        for (int i = points.size() - 1; i >= 3 ; i -= 2) {
            toLeft += points.get(i) * points.get(i - 3);
        }
        toLeft += points.get(1) * points.get(points.size() - 2);

        return 0.5 * (toRight - toLeft);
    }
}
