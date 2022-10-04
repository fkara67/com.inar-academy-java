package chapters.chapter_06;

public class Exercises_06_38 {
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 1;
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomCharacter_06_10.getRandomUpperCaseLetter() + " ");
            if (count % PER_LINE == 0) {
                System.out.println();
            }
            count++;
        }
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomCharacter_06_10.getRandomDigitCharacter() + " ");
            if (count % PER_LINE == 0) {
                System.out.println();
            }
            count++;
        }



    }
}
