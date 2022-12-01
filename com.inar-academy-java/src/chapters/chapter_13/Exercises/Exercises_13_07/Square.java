package chapters.chapter_13.Exercises.Exercises_13_07;

import chapters.chapter_13.Listing.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
