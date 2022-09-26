package chapters.chapter_05;



public class Exercises_05_24 {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 97; i += 2) {
            sum += i/(i+2);
        }
        System.out.println("Sum of series of 1/3 + 3/5 + ....95/97 + 97/99 is \n" + sum);
    }
}
