package chapters.chapter_13.Exercises.Exercises_13_06;

import chapters.chapter_13.Listing.Circle;
import org.jetbrains.annotations.NotNull;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius,color,filled);
    }

    @Override
    public int compareTo(ComparableCircle c) {
        return Double.compare(this.getArea(), c.getArea());
    }
}
