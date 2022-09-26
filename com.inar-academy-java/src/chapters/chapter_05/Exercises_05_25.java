package chapters.chapter_05;

public class Exercises_05_25 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double pi = 0;
            for (int j = 1; j <= i; j++) {
                pi += 4 * (Math.pow(-1, j + 1) / (2 * j - 1));
            }
            System.out.println("The pi value for i = " + i + " is " + pi);
        }
        System.out.println("The pi value for java Math.PI method is " + Math.PI);
    }
}
