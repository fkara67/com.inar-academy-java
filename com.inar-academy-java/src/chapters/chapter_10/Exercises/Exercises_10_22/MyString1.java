package chapters.chapter_10.Exercises.Exercises_10_22;



public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }
    public char charAt(int index) {
        return chars[index];
    }
    public int length() {
        return chars.length;
    }
    public MyString1 substring(int begin, int end) {
        char[] ch = new char[end - begin];

        System.arraycopy(chars, begin, ch, 0, end - begin);

        return new MyString1(ch);
    }
    public MyString1 toLowerCase() {
        char[] ch = new char[chars.length];

        for (int i = 0; i < ch.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                ch[i] = (char)(chars[i] + ('a' - 'A'));
            }
            else
                ch[i] = chars[i];
        }
        return new MyString1(ch);
    }
    public boolean equals(MyString1 s) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static MyString1 valueOf(int i) {
        int numberOfDigits = 0;
        int n = i;
        while (n > 0) {
            n /= 10;
            numberOfDigits++;
        }
        char[] ch = new char[numberOfDigits];

        for (int j = ch.length - 1; j >= 0; j--) {
            ch[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new MyString1(ch);
    }
    public String toString() {
        return new String(chars);
    }

}
