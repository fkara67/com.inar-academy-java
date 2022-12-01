package chapters.chapter_13.Exercises.Exercises_13_11;

import chapters.chapter_13.Listing.GeometricObject;
import org.jetbrains.annotations.NotNull;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
        this(1, "white", false);
    }

    public Octagon(double side) {
        this(side,"white", false);
    }

    public Octagon(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }
    @Override
    public Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(@NotNull Octagon o) {
        return Double.compare(this.getSide(),o.getSide());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
