package chapters.chapter_05;

public class Exercises_05_12 {
    public static void main(String[] args) {
        int n = 0;

        while (n * n < 12000) {
            n++;
        }
        System.out.println("The smallest integer n (such that n² > 12000) is " + n);
    }
}
