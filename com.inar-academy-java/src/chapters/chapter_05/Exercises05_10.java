package chapters.chapter_05;

public class Exercises05_10 {
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 0;

        for (int i = 100; i < 1001; i++) {
            if (i % 30 == 0){
                count++;
                if (count % PER_LINE == 0){
                    System.out.println(i);
                }
                else
                    System.out.print(i + " ");
            }
        }
    }
}
