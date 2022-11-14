package chapters.chapter_10.Exercises.Exercises_10_23;

import java.util.Arrays;

public class MyString2 {
    private String s;
    private char[] chars;

    public MyString2(String s) {
        chars = s.toCharArray();
        this.s = s;
    }
    public int compareTo(String s) {
        int length = Math.min(s.length(), this.s.length());
        for (int i = 0; i < length; i++) {
            if (this.s.charAt(i) != s.charAt(i)) {
                return this.s.charAt(i) - s.charAt(i);
            }
        }
        if (this.s.length() == s.length())
            return 0;
        return (this.s.length() > s.length()) ? 1 : -1;
    }
    public MyString2 substring(int begin) {
        char[] chars = new char[this.chars.length - begin];

        for (int i = begin, j = 0; i < this.chars.length; i++, j++) {
            chars[j] = this.chars[i];
        }
        return new MyString2(Arrays.toString(chars));
    }
    public MyString2 toUpperCase() {
        char[] ch = new char[chars.length];

        for (int i = 0; i < ch.length; i++) {
            if (chars[i] < 'z' && chars[i] > 'a') {
                ch[i] = (char) (chars[i] - ('a' - 'A'));
            }
            else
                ch[i] = chars[i];
        }
        return new MyString2(Arrays.toString(ch));
    }
    public char[] toChars() {
        return chars;
    }
    public static MyString2 valueOf(boolean b) {
        return new MyString2(b ? "true" : "false");
    }
}
