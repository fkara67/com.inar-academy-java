package chapters.chapter_13.Exercises.Exercises_13_01;

import chapters.chapter_12.Exercises.Exercises_12_05.IllegalTriangleException;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter three sides of triangle: ");
            double s1 = input.nextDouble();
            double s2 = input.nextDouble();
            double s3 = input.nextDouble();
            System.out.print("Enter the color of triangle: ");
            String color = input.next();
            System.out.print("Enter whether the triangle is filled(true or false): ");
            boolean filled = input.nextBoolean();

            try {
                Triangle triangle = new Triangle(s1,s2,s3,color,filled);
                System.out.println(triangle);
                break;
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        }




    }
}
