package chapters.chapter_12.Exercises.Exercises_12_05;

import chapters.chapter_11.Exercises.Exercises_11_01.GeometricObject;

public class TriangleWithException extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public TriangleWithException() throws IllegalTriangleException {
        this(1,1,1);
    }
    public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s-side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
