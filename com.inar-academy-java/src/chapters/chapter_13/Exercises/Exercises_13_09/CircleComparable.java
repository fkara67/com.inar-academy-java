package chapters.chapter_13.Exercises.Exercises_13_09;

import chapters.chapter_13.Listing.GeometricObject;

public class CircleComparable extends GeometricObject implements Comparable<CircleComparable> {
    private double radius;

    public CircleComparable() {
    }

    public CircleComparable(double radius) {
        this(radius,"white" , false);
    }

    public CircleComparable(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created on " + getDateCreated() + " and the radius is " + radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(CircleComparable o) {
        return Double.compare(this.radius, o.radius);
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((CircleComparable) o) == 0;
    }
}
