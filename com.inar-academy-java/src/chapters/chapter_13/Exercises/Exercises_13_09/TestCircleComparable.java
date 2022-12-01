package chapters.chapter_13.Exercises.Exercises_13_09;

public class TestCircleComparable {
    public static void main(String[] args) {
        CircleComparable c1 = new CircleComparable(5);
        CircleComparable c2 = new CircleComparable(4);
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2));

        CircleComparable a1 = new CircleComparable(5);
        CircleComparable a2 = new CircleComparable(5);
        System.out.println("\na1.equals(a2): " + a1.equals(a2));
        System.out.println("a1.compareTo(a2): " + a1.compareTo(a2));

        CircleComparable b1 = new CircleComparable(5);
        CircleComparable b2 = new CircleComparable(6);
        System.out.println("\nb1.equals(b2): " + b1.equals(b2));
        System.out.println("b1.compareTo(b2): " + b1.compareTo(b2));
    }
}
