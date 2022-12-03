package chapters.chapter_13.Exercises.Exercises_13_21;

import chapters.chapter_13.Listing.Rational;

import java.util.Scanner;

public class VertexFormEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c (for ax²+bx+c=0 statement): ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double h = (b / (-2 * a));
        double k = c - (Math.pow(b,2) / (4 * a));

        String h2 = String.valueOf(h);
        String k2 = String.valueOf(k);

        String[] partsH = h2.split("\\.");
        String[] partsK = k2.split("\\.");
        String allH = partsH[0] + partsH[1];
        String allK = partsK[0] + partsK[1];

        Rational h3 = new Rational(Integer.parseInt(allH), (int)Math.pow(10, partsH[1].length()));
        Rational k3 = new Rational(Integer.parseInt(allK), (int)Math.pow(10, partsK[1].length()));

        System.out.println("for vertex form y = a(x - h)² + k -> h = " + h3 + " k = " + k3);
    }
}
