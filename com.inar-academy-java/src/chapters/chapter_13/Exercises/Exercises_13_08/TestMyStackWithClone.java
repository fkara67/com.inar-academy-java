package chapters.chapter_13.Exercises.Exercises_13_08;

public class TestMyStackWithClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStackWithClone c = new MyStackWithClone();
        c.push(5);
        c.push(6);
        c.push(7);

        MyStackWithClone d = c.clone();
        d.pop();
        System.out.println(c);
        System.out.println(d);
    }
}
