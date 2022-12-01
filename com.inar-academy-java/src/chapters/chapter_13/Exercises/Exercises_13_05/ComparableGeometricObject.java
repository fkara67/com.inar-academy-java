package chapters.chapter_13.Exercises.Exercises_13_05;

import java.util.Date;

public abstract class ComparableGeometricObject implements Comparable<ComparableGeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected ComparableGeometricObject() {
        dateCreated = new Date();
    }
    protected ComparableGeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor " + color + " and filled: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public static ComparableGeometricObject max(ComparableGeometricObject o1 , ComparableGeometricObject o2) {
        return (o1.compareTo(o2) > 0) ? o1 : o2;
    }
    public int compareTo(ComparableGeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        }
        else if (this.getArea() < o.getArea()) {
            return -1;
        }
        else
            return 0;
    }
}
