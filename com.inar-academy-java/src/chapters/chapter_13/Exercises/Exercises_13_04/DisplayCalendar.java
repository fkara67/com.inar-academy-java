package chapters.chapter_13.Exercises.Exercises_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendar {
    public static void main(String[] args) {
        if (args.length != 2 && args.length != 0) {
            System.out.println("Usage1: java DisplayCalendar MonthNumber Year");
            System.out.println("Usage2: java DisplayCalendar");
            System.exit(1);
        }
        int month;
        int year;
        if (args.length == 2) {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[1]);
        }
        else {
            Calendar calendar = new GregorianCalendar();
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);
        }

        controlInput(month);

        Calendar calendar = new GregorianCalendar(year, month,1);
        printMonth(year,month,calendar);

    }

    public static void printMonth(int year, int month, Calendar calendar) {
        // Print the headings of the calendar
        printMonthTitle(year, month);
        // Print the body of the calendar
        printMonthBody(calendar);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 0: monthName = "January"; break;
            case 1: monthName = "February"; break;
            case 2: monthName = "March"; break;
            case 3: monthName = "April"; break;
            case 4: monthName = "May"; break;
            case 5: monthName = "June"; break;
            case 6: monthName = "July"; break;
            case 7: monthName = "August"; break;
            case 8: monthName = "September"; break;
            case 9: monthName = "October"; break;
            case 10: monthName = "November"; break;
            case 11: monthName = "December";
        }
        return monthName;
    }

    public static void printMonthBody(Calendar calendar) {
        // Get start day of the week for the first date in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        // Get number of days in the month
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Pad space before the first day of the month
        int i ;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (i = 1; i < numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void controlInput(int month) {
        if (month < 0 || month > 11) {
            System.out.println("Invalid Month! (0 - 11 required)");
            System.exit(2);
        }
    }
}
