package chapters.chapter_13.Exercises.Exercises_13_05;

public class Test {
    public static void main(String[] args) {
        ComparableGeometricObject o1 = new Circle(5);
        ComparableGeometricObject o2 = new Circle(6);
        System.out.println("ComparableGeometricObject.max(o1,o2) : "
                + ((ComparableGeometricObject.max(o1,o2) == o1) ? "o1" : "o2"));


        Circle c1 = new Circle(5);
        Circle c2 = new Circle(6);
        System.out.println("ComparableGeometricObject.max(c1,c2) : "
                + ((ComparableGeometricObject.max(c1,c2) == c1) ? "c1" : "c2"));

        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(10, 12);
        System.out.println("ComparableGeometricObject.max(r1,r2) : "
                + (ComparableGeometricObject.max(r1,r2) == r1 ? "r1" : "r2"));
    }
}
