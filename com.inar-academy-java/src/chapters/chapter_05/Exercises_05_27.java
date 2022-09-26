package chapters.chapter_05;

public class Exercises_05_27 {
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 0;

        for (int year = 101; year <= 2100; year++) {
            boolean isLeapYear = true;
            if (isLeapYear(year)) {
                isLeapYear = true;
                count++;

                if (count % PER_LINE == 0)
                    System.out.println(year);
                else
                    System.out.print(year + " ");
            }
        }
        System.out.println("\n\nCount of the leap years from 101 to 2100 is " + count);
    }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
            return false;

    }
}
