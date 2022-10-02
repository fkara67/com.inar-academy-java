package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a millisecond number: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));

    }
    public static String convertMillis(long millis) {
        long totalHours = 0;
        long currentSecond = 0;
        long currentMinute = 0;

        long i = millis;
        long totalSeconds = i / 1000;
        i /= 1000;
        currentSecond = i % 60;
        long totalMinutes = totalSeconds / 60;
        i /= 60;
        currentMinute = i % 60;
        totalHours = i / 60;
        i /= 60;
        return totalHours + ":" + currentMinute + ":" + currentSecond;
    }
}

