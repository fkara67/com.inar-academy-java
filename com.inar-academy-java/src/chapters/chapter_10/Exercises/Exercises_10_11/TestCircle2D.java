package chapters.chapter_10.Exercises.Exercises_10_11;

public class TestCircle2D {
    /* Write a test program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
       displays its area and perimeter, and displays the result of c1.contains(3,3),
       c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(newCircle2D(3, 5, 2.3)).
     */
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.printf("The area of c1 is %.3f\n", c1.getArea());
        System.out.printf("The perimeter of c1 is %.3f\n", c1.getPerimeter());

        System.out.println("c1.contains(3,3) --> " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)) --> " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)) --> " + c1.overlaps(new Circle2D(3, 5, 2.3)));
        System.out.println(c1.contains(new Circle2D(1, 1 , 2)));
        System.out.println(c1.overlaps(new Circle2D(1, 1, 2)));
    }
}
