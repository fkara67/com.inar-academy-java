package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++ ) {
            for (int space = n - i; space > 0; space--) {
                System.out.print("     ");
            }
            for (int part = i; part > 0; part--) {
                System.out.printf("%5d",part);
            }
            System.out.println();
        }

    }
}
