package chapters.chapter_10.Exercises.Exercises_10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
    public boolean contains(double x, double y) {
        return (Math.abs(this.x - x) <= width / 2 && Math.abs(this.y - y) <= height / 2);
    }
    public boolean contains(MyRectangle2D rectangle) {
        return (Math.abs(x - rectangle.getX()) <= width / 2 - rectangle.getWidth() / 2 &&
                Math.abs(y - rectangle.getY()) <= height / 2 - rectangle.getHeight() / 2);
    }
    public boolean overlaps(MyRectangle2D rectangle) {
        return ((Math.abs(y - rectangle.getY()) <= height / 2 + rectangle.getHeight() / 2 ||
                Math.abs(x - rectangle.getX()) <= width / 2 + rectangle.getWidth() / 2) &&
                !contains(rectangle));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
