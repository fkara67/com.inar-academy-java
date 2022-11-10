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
}
