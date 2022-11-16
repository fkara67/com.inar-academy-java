package chapters.chapter_11.Listing;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject() {
        this(0,0,"white",false);
    }

    public RectangleFromSimpleGeometricObject(double width, double height) {
        this(width,height,"white",false);

    }
    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
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
}
