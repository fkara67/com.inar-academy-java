package chapters.chapter_09.Exercises.Exercises_09_10;

import java.util.Scanner;

public class TestQuadraticEquation {
    /* 1- prompt the user to enter values for a, b, and c
       2- displays the result based on the discriminant
       3- If the discriminant is positive, display the two roots
       4- If the discriminant is 0, display the one root
       5- . Otherwise, display “The equation has no roots.”
     */
    public static void main(String[] args) {
        System.out.print("Enter a, b, c for Quadratic Equation: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        displayResult(equation);
    }
    public static void displayResult(QuadraticEquation equation) {
        if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots.");
        }
        else if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has one root. It's " + equation.getRoot1());
        }
        else {
            System.out.printf("The equation has two roots: %.6f and %.6f", equation.getRoot1(), equation.getRoot2());
        }
    }
}
