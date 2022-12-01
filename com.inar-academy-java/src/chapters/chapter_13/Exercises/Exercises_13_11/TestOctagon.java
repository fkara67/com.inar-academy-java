package chapters.chapter_13.Exercises.Exercises_13_11;

public class TestOctagon {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o = new Octagon(5);
        System.out.println("Area(o): " + o.getArea());
        System.out.println("Perimeter(o):  " + o.getPerimeter());

        Octagon b = o.clone();
        System.out.println("\nArea(b): " + b.getArea());
        System.out.println("Perimeter(b):  " + b.getPerimeter());
        System.out.println("\no.compareTo(b): " + o.compareTo(b));
    }
}
