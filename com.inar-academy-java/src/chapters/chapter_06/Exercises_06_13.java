package chapters.chapter_06;

public class Exercises_06_13 {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("---------------------");
        for (double i = 1; i <= 20; i++) {
            System.out.printf("%-8s%10.4f", i, sumSeries(i));
            System.out.println();
        }

    }
    public static double sumSeries(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);

        }
        return sum;
    }
}
