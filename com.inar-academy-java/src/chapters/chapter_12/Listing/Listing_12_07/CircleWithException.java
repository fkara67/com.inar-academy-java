package chapters.chapter_12.Listing.Listing_12_07;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1);
    }
    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }
    public double findArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
