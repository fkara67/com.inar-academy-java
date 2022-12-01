package chapters.chapter_13.Exercises.Exercises_13_12;

import chapters.chapter_13.Listing.Circle;
import chapters.chapter_13.Listing.GeometricObject;
import chapters.chapter_13.Listing.Rectangle;

public class SumAreasOfGeometricObjects {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(5), new Rectangle(5,6),
                                     new Circle(6), new Rectangle(6,8)};

        System.out.println("Sum of all the geometric objects: " + sumArea(objects));
    }
    public static double sumArea(GeometricObject[] list) {
        double total = 0;
        for (GeometricObject object : list) {
            total += object.getArea();
        }
        return total;
    }
}
