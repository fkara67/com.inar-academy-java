package chapters.chapter_09.Exercises.Exercises_09_05;

import java.util.GregorianCalendar;

public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH) + " " + date.get(GregorianCalendar.MONTH)
                + " " + date.get(GregorianCalendar.YEAR));

        date.setTimeInMillis(1234567898765L);
        System.out.print("\n" + date.get(GregorianCalendar.DAY_OF_MONTH) + " " + date.get(GregorianCalendar.MONTH)
                + " " + date.get(GregorianCalendar.YEAR));
    }
}
