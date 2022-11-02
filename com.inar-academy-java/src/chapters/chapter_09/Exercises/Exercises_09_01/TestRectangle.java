package chapters.chapter_09.Exercises.Exercises_09_01;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("r1\n--------------------");
        System.out.printf("Width: %1.2f\nHeight: %1.2f\nArea: %1.2f\nPerimeter: %1.2f\n",
                r1.width, r1.height, r1.getArea(), r1.getPerimeter());

        System.out.println();

        System.out.println("r2\n-----------");
        System.out.printf("Width: %1.2f\nHeight: %3.2f\nArea: %1.2f\nPerimeter: %1.2f\n",
                r2.width, r2.height, r2.getArea(), r2.getPerimeter());
    }

}
