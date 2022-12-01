package chapters.chapter_13.Exercises.Exercises_13_07;

import chapters.chapter_13.Listing.Circle;
import chapters.chapter_13.Listing.GeometricObject;
import chapters.chapter_13.Listing.Rectangle;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Square(5), new Rectangle(10 ,15),
                                     new Square(15), new Square(16), new Circle(8)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Objects[" + i + "]\nArea: " + objects[i].getArea());
            if (objects[i] instanceof Square) {
                ((Square) objects[i]).howToColor();
            }
            System.out.println();
        }
    }
}
