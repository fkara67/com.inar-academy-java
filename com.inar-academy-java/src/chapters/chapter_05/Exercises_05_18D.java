package chapters.chapter_05;

public class Exercises_05_18D {
    public static void main(String[] args) {
        for (int row = 1; row <= 6; row++) {
            for (int space = row - 1; space > 0; space--) {
                System.out.print("  ");
            }
            for (int part = 1;part <= 7 - row; part++) {
                System.out.print(part + " ");
            }
            System.out.println();
        }
    }
}
