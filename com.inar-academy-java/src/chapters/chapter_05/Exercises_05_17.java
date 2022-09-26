package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 15: ");
        int maxRow = input.nextInt();

        for (int row = 1; row <= maxRow; row++) {
            for (int space = maxRow - row; space > 0; space--) {
                System.out.print("    ");
            }
            for (int part1 = row; part1 >= 1; part1--) {
                System.out.printf("%3d ", part1);
            }
            for (int part2 = 2; part2 <= row; part2++) {
                System.out.printf("%3d ", part2);
            }
            System.out.println();
        }
    }
}
