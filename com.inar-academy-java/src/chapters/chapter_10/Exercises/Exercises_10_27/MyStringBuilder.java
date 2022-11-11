package chapters.chapter_10.Exercises.Exercises_10_27;

public class MyStringBuilder {
    private String s;

    public MyStringBuilder(String s) {
        this.s = s;
    }
    public MyStringBuilder append(MyStringBuilder s) {
        this.s += s.toString();
        return this;
    }
    public MyStringBuilder append(int i) {
        this.s += i;
        return this;
    }
    public int length() {
        return s.length();
    }
    public char charAt(int index) {
        return s.charAt(index);
    }
    public MyStringBuilder toLowerCase() {
        s = s.toLowerCase();
        return this;
    }
    public MyStringBuilder substring(int begin, int end) {
        s = s.substring(begin, end);
        return this;
    }
    public String toString() {
        return s;
    }
}
