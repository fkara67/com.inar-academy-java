package chapters.chapter_10.Exercises.Exercises_10_24;

public class MyCharacter {
    private char c;

    public MyCharacter() {
    }
    public MyCharacter(char c) {
        this.c = c;
    }
    public static boolean isLetter(char c) {
        return (c <= 'Z' && c > 'A') || (c < 'z' && c >= 'a');
    }
    public static boolean isDigit(char c) {
        return c <= '9' && c >= '0';
    }
    public static boolean isLetterOrDigit(char c) {
        return isLetter(c) || isDigit(c);
    }
    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }
    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }
    public String toString(char c) {
        return String.valueOf(c);
    }
    public static char toLowerCase(char c) {
        if (isUpperCase(c)) {
            return (char) (c + ('a' - 'A'));
        }
        return c;
    }
    public static char toUpperCase(char c) {
        if (isLowerCase(c)) {
            return (char) (c - ('a' - 'A'));
        }
        return c;
    }
}
