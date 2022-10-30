package weeks.week_12;

public class Circle1 {
    /**
     * Data Fields
     */
    String color;
    double radius;
    private double area;
    boolean isFilled;

    /**
     * Constructors
     * 1- Same Class Name
     * 2- No return type
     * 3- Static-Nonstatic is not an option
     */
    public Circle1() {
        color = "BLACK";
        radius = 1;
        isFilled = false;
    }
    public Circle1(double radius) {
        this();
        this.radius = radius;
    }
    /**
     * Methods
     * - Getter / Setter
     * - Method
     */

    public double getArea() {
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void fillTheCircle() {
        isFilled = true;
    }
    public void cleanTheCircle() {
        isFilled = false;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void print() {
        System.out.println("---------------------------");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("isFilled: " + isFilled);
        System.out.println("Color: " + color);
        System.out.println("-----------------------------");
    }
}
