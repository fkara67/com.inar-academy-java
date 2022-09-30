package chapters.chapter_06;

public class Exercises_06_16 {
    public static void main(String[] args) {
        System.out.println("Year\t\tNumber Of Days");
        System.out.println("-----------------------------");

        for (int year = 2000; year <= 2020; year++) {
            System.out.print(year + "\t\t " + numberOfDaysInAYear(year));
            System.out.println();
        }
    }
    public static int numberOfDaysInAYear(int year) {
        if (Listing_06_12.isLeapYear(year)) {
            return 366;
        }
        else
            return 365;
    }
}
