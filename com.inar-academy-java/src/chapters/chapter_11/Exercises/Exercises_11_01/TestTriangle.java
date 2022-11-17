package chapters.chapter_11.Exercises.Exercises_11_01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter whether the triangle is filled (true or false): ");
        boolean filled = input.nextBoolean();
        System.out.print("Enter color of the triangle: ");
        String color = input.next();

        Triangle t = new Triangle(side1, side2, side3);
        t.setColor(color);
        t.setFilled(filled);

        System.out.printf("\nArea: %s\nPerimeter: %s1\nColor: %s\nIs Filled: %s", t.getArea(),t.getPerimeter(),t.getColor(),t.isFilled());

    }
}
