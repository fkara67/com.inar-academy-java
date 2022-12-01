package chapters.chapter_13.Exercises.Exercises_13_10;

import chapters.chapter_13.Listing.GeometricObject;
import org.jetbrains.annotations.NotNull;

public class RectangleComparable extends GeometricObject implements Comparable<RectangleComparable> {
    private double width;
    private double height;

    public RectangleComparable() {
        this(0,0, "white", false);
    }

    public RectangleComparable(double width, double height) {
        this(width,height,"white",false);
    }

    public RectangleComparable(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public int compareTo(@NotNull RectangleComparable o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((RectangleComparable) o) == 0;
    }
}
