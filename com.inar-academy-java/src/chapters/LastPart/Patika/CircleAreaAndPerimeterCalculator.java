package chapters.LastPart.Patika;

import java.util.Scanner;

public class CircleAreaAndPerimeterCalculator {
    public static void main(String[] args) {
        double area, perimeter;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double r = input.nextDouble();

        area = Math.PI * r * r;
        perimeter = 2 * Math.PI * r;

        System.out.println("Area : " + area + "\nPerimeter: " + perimeter);

    }
}
