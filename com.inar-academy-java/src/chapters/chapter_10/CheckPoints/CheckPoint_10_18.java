package chapters.chapter_10.CheckPoints;

public class CheckPoint_10_18 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";

        String s3 = s1.replace('e','E');

        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
