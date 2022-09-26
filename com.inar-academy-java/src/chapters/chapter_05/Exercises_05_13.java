package chapters.chapter_05;

public class Exercises_05_13 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n, 3) < 12000) {
            n++;
        }
        System.out.println("The largest integer n (such that n³ < 12000) is " + n);
    }
}
