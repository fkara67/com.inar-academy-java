package chapters.chapter_05;

public class Exercises_05_18C {
    public static void main(String[] args) {
        for (int row = 1; row <= 6; row++) {
            for (int space = 6 - row; space >= 0; space--) {
                System.out.print("  ");
            }
            for (int part = row; part >= 1; part--) {
                System.out.print(part + " ");
            }
            System.out.println();
        }
    }
}
