package chapters.LastPart.Patika;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight as kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height as meter: ");
        double height = input.nextDouble();

        double bodyMassIndex = weight / Math.pow(height,2);

        System.out.println("Your Body Mass Index: " + bodyMassIndex);
    }
}
