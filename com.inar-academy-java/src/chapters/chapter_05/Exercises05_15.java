package chapters.chapter_05;

public class Exercises05_15 {
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 1;

        for (int i = 33; i < 127; i++ , count++) {
            char ch = (char)i;
            if (count % PER_LINE == 0) {
                System.out.println(ch);
            }
            else
                System.out.print(ch + " ");
        }


    }
}
