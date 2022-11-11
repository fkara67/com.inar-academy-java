package chapters.chapter_10.Exercises.Exercises_10_11;
/* ■ Two double data fields named x and y that specify the center of the circle
with getter methods.
 ■ A data field radius with a getter method.
 ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
 ■ A constructor that creates a circle with the specified x, y, and radius.
 ■ A method getArea() that returns the area of the circle.
 ■ A method getPerimeter() that returns the perimeter of the circle.
 ■ A method contains(double x, double y) that returns true if the
    specified point (x, y) is inside this circle (see Figure 10.21a).
 ■ A method contains(Circle2D circle) that returns true if the specified circle is inside this circle (see Figure 10.21b).
 ■ A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle (see Figure 10.21c).

 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0,0,1);
    }
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.y - y, 2) + Math.pow(this.x - x, 2));
        if (distance < radius) {
            return true;
        }
        return false;
    }
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.y - circle.y, 2) + Math.pow(this.x - circle.x, 2));
        if (distance > this.radius + circle.radius && !this.contains(circle)) {
            return false;
        }
        return true;
    }
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.y - circle.y, 2) + Math.pow(this.x - circle.x, 2));
        if (!this.contains(circle) && distance < this.radius + circle.radius) {
            return true;
        }
        return false;
    }
    public double getRadius() {
        return radius;
    }
}
