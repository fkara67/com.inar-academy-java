package chapters.chapter_05;

public class Exercises_05_40 {
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount = 0;

        for (int i = 0; i < 1_000_000; i++) {
            int coin = (int)(Math.random() * 2);

            if (coin == 0) {
                headCount++;
            }
            else
                tailCount++;
        }
        System.out.println("The number of heads is " + headCount);
        System.out.println("The number of tails is " + tailCount);
    }
}
