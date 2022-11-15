package chapters.chapter_10.Exercises.Exercises_10_28;

public class TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 a = new MyStringBuilder2("akaca");
        MyStringBuilder2 b = new MyStringBuilder2("bakacaz");

        MyStringBuilder2 c = a.insert(4, b);
        System.out.println(c);
        System.out.println(a.reverse());

        System.out.println(c.substring(4));
        System.out.println(c.toUpperCase());
    }
}
