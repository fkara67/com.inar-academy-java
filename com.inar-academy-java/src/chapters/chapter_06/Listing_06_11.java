package chapters.chapter_06;

public class Listing_06_11 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter_06_10.getRandomLowerCaseLetter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter_06_10.getRandomUpperCaseLetter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter_06_10.getRandomDigitCharacter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter_06_10.getRandomCharacter() + " ");
        }
        System.out.println();
    }
}
