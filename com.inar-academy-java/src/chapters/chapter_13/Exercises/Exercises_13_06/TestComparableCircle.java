package chapters.chapter_13.Exercises.Exercises_13_06;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(32);
        ComparableCircle c2 = new ComparableCircle(18);
        System.out.println("c1.compareTo(c2) : " + c1.compareTo(c2));

        ComparableCircle a1 = new ComparableCircle(18);
        ComparableCircle a2 = new ComparableCircle(32);
        System.out.println("a1.compareTo(a2) : " + a1.compareTo(a2));

        ComparableCircle b1 = new ComparableCircle(18);
        ComparableCircle b2 = new ComparableCircle(18);
        System.out.println("b1.compareTo(b2) : " + b1.compareTo(b2));
    }
}
