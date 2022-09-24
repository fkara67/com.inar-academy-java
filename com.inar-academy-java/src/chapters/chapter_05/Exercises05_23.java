package chapters.chapter_05;

public class Exercises05_23 {
    public static void main(String[] args) {
        double sumLargeToSmall = 0;
        double sumSmallToLarge = 0;
        for (double i = 50000.0; i > 0; i--) {
            sumLargeToSmall += 1/i;
        }
        System.out.println("Large to small sum is " + sumLargeToSmall);

        for (double i = 1; i <= 50000.0; i++) {
            sumSmallToLarge += 1/i;
        }
        System.out.println("Small to large sum is " +  sumSmallToLarge);
    }
}
