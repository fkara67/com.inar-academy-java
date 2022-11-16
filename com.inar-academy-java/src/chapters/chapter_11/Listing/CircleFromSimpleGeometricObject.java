package chapters.chapter_11.Listing;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }
    public CircleFromSimpleGeometricObject(double radius) {
        this(radius,"white",false);
    }
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void printCircle() {
        System.out.println("The circle is created on " + getDateCreated() + " and the radius is " + radius);
    }
    public String toString() {
        return super.toString() + "\nRadius is " + radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
