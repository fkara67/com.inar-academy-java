package chapters.chapter_06;

public class Exercises_06_24 {
    public static void main(String[] args) {
        displayCurrentTime();
        displayCurrentDate();

    }
    public static void displayCurrentTime() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;


        int totalYears = (int)(totalDays / 365);
        int currentYear = totalYears + 1970;

        totalDays = (totalDays - (countOfLeapYearsSince1970(currentYear))) % 365;
        if (currentHour > 0)
            totalDays++;
        int currentMonth = getMonthFromDays(currentYear,(int)totalDays);
        System.out.println(currentYear + " " + totalDays);
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
    public static void displayCurrentDate() {

    }
    public static int countOfLeapYearsSince1970(int year) {
        int leapYearCount = 0;
        for (int i = 1970; i <= year; i++) {
            if (Listing_06_12.isLeapYear(i)) {
                leapYearCount++;
            }
        }
        return leapYearCount;
    }
    public static int getMonthFromDays(int year, int days) {
        int dayCount = 0;
        for (int i = 1; i <= 12; i++) {
            dayCount += Listing_06_12.getNumberOfDaysInMonth(year,i);
            if (dayCount > days)
                return i;
        }
        return 12;
    }

}
