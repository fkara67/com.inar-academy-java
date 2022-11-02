package chapters.chapter_09.Exercises.Exercises_09_03;

import java.util.Date;

public class UseDateClass {
    public static void main(String[] args) {

        Date date = new Date();
        long elapsedTime = 10000;
        for (int i = 0; i < 7; i++) {
            date.setTime(elapsedTime);
            System.out.println("For elapsed time " + elapsedTime + " date and tame is " + date);
            elapsedTime *= 10;
        }
    }
}
