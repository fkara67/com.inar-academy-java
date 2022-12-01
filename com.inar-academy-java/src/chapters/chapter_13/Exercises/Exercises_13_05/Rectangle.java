package chapters.chapter_13.Exercises.Exercises_13_05;

public class Rectangle extends ComparableGeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(0,0, "white", false);
    }

    public Rectangle(double width, double height) {
        this(width,height,"white",false);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height +
                "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
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
}
