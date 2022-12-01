package chapters.chapter_13.Exercises.Exercises_13_10;

import chapters.chapter_13.Exercises.Exercises_13_09.CircleComparable;

public class TestRectangleComparable {
    public static void main(String[] args) {
        RectangleComparable c1 = new RectangleComparable(5, 10);
        RectangleComparable c2 = new RectangleComparable(10, 12);
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2));

        RectangleComparable a1 = new RectangleComparable(5, 10);
        RectangleComparable a2 = new RectangleComparable(5, 10);
        System.out.println("\na1.equals(a2): " + a1.equals(a2));
        System.out.println("a1.compareTo(a2): " + a1.compareTo(a2));

        RectangleComparable b1 = new RectangleComparable(10, 12);
        RectangleComparable b2 = new RectangleComparable(5, 10);
        System.out.println("\nb1.equals(b2): " + b1.equals(b2));
        System.out.println("b1.compareTo(b2): " + b1.compareTo(b2));
    }
}
