package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the pentagon: ");
        double side = input.nextDouble();
        System.out.println(area(side));
    }
    public static double area(double side) {
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
        return area;
    }

}
