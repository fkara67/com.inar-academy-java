package chapters.LastPart.Patika;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int side1 = input.nextInt();

        System.out.print("Enter second side: ");
        int side2 = input.nextInt();

        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

        System.out.println("Hypotenuse of the triangle is " + hypotenuse);
    }
}
