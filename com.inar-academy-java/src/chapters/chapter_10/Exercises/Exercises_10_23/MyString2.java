package chapters.chapter_10.Exercises.Exercises_10_23;

public class MyString2 {
    private String s;

    public MyString2(String s) {
        this.s = s;
    }
    public int compareTo(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (this.s.charAt(i) != s.charAt(i)) {
                return this.s.charAt(i) - s.charAt(i);
            }
        }
        return 0;
    }
}
