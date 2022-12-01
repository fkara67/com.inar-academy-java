package chapters.chapter_13.Exercises.Exercises_13_05;

public class Circle extends ComparableGeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this(radius,"white" , false);
    }

    public Circle(double radius, String color, boolean filled) {
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

    public String toString() {
       return super.toString() + "\nRadius: " + this.getRadius() +
               "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
