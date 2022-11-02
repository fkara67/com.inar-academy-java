package chapters.chapter_09.Exercises.Exercises_09_01;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
       this(1, 1);
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
}
