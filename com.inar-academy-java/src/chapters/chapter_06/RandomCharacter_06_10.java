package chapters.chapter_06;

public class RandomCharacter_06_10 {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
