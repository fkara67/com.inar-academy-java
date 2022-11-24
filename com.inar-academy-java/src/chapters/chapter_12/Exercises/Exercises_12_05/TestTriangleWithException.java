package chapters.chapter_12.Exercises.Exercises_12_05;

import java.util.Scanner;

public class TestTriangleWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter three sides of the triangle: ");
            double s1 = input.nextInt();
            double s2 = input.nextInt();
            double s3 = input.nextInt();

            try {
                TriangleWithException t = new TriangleWithException(s1,s2,s3);
                System.out.printf("\nArea: %s\nPerimeter: %s1\nColor: %s\nIs Filled: %s\n",
                        t.getArea(),t.getPerimeter(),t.getColor(),t.isFilled());
                break;
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
