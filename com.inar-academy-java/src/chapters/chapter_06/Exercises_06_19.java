package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (MyTriangle.isValid(side1,side2,side3) == false) {
            System.out.println("The input is invalid");
            System.exit(0);

        }
        System.out.println(MyTriangle.area(side1,side2,side3));
    }
}
