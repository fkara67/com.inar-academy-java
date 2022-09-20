package chapters.chapter_05;

public class Exercises05_19 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        for (int row = 1; row <= 8; row++) {
            for (int space = 8 - row; space > 0; space--) {
                System.out.print("    ");
            }
            for (int part1 = 1; part1 <= row; part1++) {
                num1 = (int) Math.pow(2,part1 - 1);
                System.out.printf("%3d ",num1);
            }
            for (int part2 = row - 1; part2 > 0; part2--) {
                num2 = (int)Math.pow(2, part2 - 1);
                System.out.printf("%3d ", num2);

            }
            System.out.println();
        }
    }
}
