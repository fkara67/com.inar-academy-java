package chapters.chapter_05;

public class Exercises05_23 {
    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0;
        for (double i = 50000.0; i > 0; i--) {
            sum += 1/i;
        }
        System.out.println(sum);

        for (double i = 1; i <= 50000.0; i++) {
            sum1 += 1/i;
        }
        System.out.println(sum1);
    }
}
