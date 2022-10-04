package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the polygon is " + area(numberOfSides,side));
    }
    public static double area(int n, double side) {
        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return area;
    }
}
