package chapters.chapter_10.Exercises.Exercises_10_23;

import static chapters.chapter_10.Exercises.Exercises_10_23.MyString2.valueOf;

public class TestMyString2 {
    public static void main(String[] args) {
        MyString2 m = new MyString2("FATIH");
        System.out.println(m.compareTo("FATIHK"));

        System.out.println(m.substring(2));

        MyString2 b = new MyString2("adem");
        System.out.println(b.toUpperCase());

        char[] c = b.toChars();
        for (char value : c) {
            System.out.print(value + " ");
        }
        boolean a = true;
        System.out.println("\n" + valueOf(a));

        System.out.println(Character.isUpperCase('a'));



    }
}
