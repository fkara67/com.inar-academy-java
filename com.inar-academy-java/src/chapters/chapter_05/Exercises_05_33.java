package chapters.chapter_05;

public class Exercises_05_33 {
    public static void main(String[] args) {
        for (int i = 10000; i >= 6; i--) {
            int sumOfDivisors = 0;
            for (int divisor = i / 2; divisor > 0; divisor-- ) {
                if (i % divisor == 0) {
                    sumOfDivisors += divisor;
                }
            }
            if (sumOfDivisors == i) {
                System.out.println(i);
            }
        }
    }
}
