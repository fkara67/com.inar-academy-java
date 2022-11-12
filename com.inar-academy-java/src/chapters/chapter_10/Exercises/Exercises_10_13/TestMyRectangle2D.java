package chapters.chapter_10.Exercises.Exercises_10_13;

public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);


        System.out.printf("The area of r1 is %.3f\n", r1.getArea());
        System.out.printf("The perimeter of r1 is %.3f\n", r1.getPerimeter());
        System.out.println("r1.contains(3,3) --> " + r1.contains(3, 3));
        System.out.println("r1.contains(new Circle2D(4, 5, 10.5)) --> "
                + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1.overlaps(new Circle2D(3, 5, 2.3)) --> "
                + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

    }
}
