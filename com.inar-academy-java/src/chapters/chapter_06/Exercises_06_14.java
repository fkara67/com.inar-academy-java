package chapters.chapter_06;

public class Exercises_06_14 {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("---------------------");

        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-8s%10.4f", i , estimatePi(i));
            System.out.println();
        }

    }
    public static double estimatePi(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * sum;
    }
}
