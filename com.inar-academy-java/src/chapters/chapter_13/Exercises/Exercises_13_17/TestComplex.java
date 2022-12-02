package chapters.chapter_13.Exercises.Exercises_13_17;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        Complex c1 = new Complex(input.nextDouble(), input.nextDouble());

        System.out.print("Enter the second complex number: ");
        Complex c2 = new Complex(input.nextDouble(), input.nextDouble());

        System.out.println("(" + c1.getRealPart() + " + " + c1.getImaginaryPart() + "i) + ("
                + c2.getRealPart() + " + " + c2.getImaginaryPart() + "i) = " + c1.add(c2));

        System.out.println("(" + c1.getRealPart() + " + " + c1.getImaginaryPart() + "i) - ("
                + c2.getRealPart() + " + " + c2.getImaginaryPart() + "i) = " + c1.subtract(c2));

        System.out.println("(" + c1.getRealPart() + " + " + c1.getImaginaryPart() + "i) * ("
                + c2.getRealPart() + " + " + c2.getImaginaryPart() + "i) = " + c1.multiply(c2));

        System.out.println("(" + c1.getRealPart() + " + " + c1.getImaginaryPart() + "i) / ("
                + c2.getRealPart() + " + " + c2.getImaginaryPart() + "i) = " + c1.divide(c2));

        System.out.println("|(" + c1 + ")| = " + c1.abs());

    }
}
