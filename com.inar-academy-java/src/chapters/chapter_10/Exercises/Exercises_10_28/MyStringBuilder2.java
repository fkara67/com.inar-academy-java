package chapters.chapter_10.Exercises.Exercises_10_28;

import java.util.Arrays;

public class MyStringBuilder2 {
    private String s;
    private char[] chars;

    public MyStringBuilder2() {
    }
    public MyStringBuilder2(String s) {
        this.s = s;
        this.chars = s.toCharArray();
    }
    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
        this.s = Arrays.toString(chars);
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 m) {
        char[] chars1 = new char[chars.length + m.chars.length];

        if (offset >= 0) {
            System.arraycopy(chars, 0, chars1, 0, offset);
        }
        System.arraycopy(m.chars,0,chars1, offset,m.chars.length);
        System.arraycopy(chars,offset,chars1, offset + m.chars.length, chars.length - offset);
        return new MyStringBuilder2(chars1);
    }
    public MyStringBuilder2 reverse() {
        char[] chars1 = new char[chars.length];
        for (int i = chars.length - 1, j = 0; i >= 0; i--,j++) {
            chars1[j] = chars[i];
        }
        return new MyStringBuilder2(chars1);
    }
    public MyStringBuilder2 substring(int begin) {
        char[] chars1 = new char[chars.length - begin];
        for (int i = begin, j = 0;i < chars.length; i++, j++) {
            chars1[j] = chars[i];
        }
        return new MyStringBuilder2(chars1);
    }
    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - ('a' - 'A'));
            }
        }
        return new MyStringBuilder2(chars);
    }
    public String toString() {
        return s;
    }
}
