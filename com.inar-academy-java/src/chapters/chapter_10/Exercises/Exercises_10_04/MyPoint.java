package chapters.chapter_10.Exercises.Exercises_10_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(p.y - this.y,2) + Math.pow(p.x - this.x, 2));
    }
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(y - this.y,2) + Math.pow(x - this.x, 2));
    }
}
