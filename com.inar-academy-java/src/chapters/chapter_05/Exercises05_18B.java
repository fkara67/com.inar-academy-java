package chapters.chapter_05;

public class Exercises05_18B {
    public static void main(String[] args) {
        for (int row = 1; row <= 6; row++) {
            for (int part = 1; part <= 7 - row; part++) {
                System.out.print(part + " ");
            }
            System.out.println();
        }

    }
}
