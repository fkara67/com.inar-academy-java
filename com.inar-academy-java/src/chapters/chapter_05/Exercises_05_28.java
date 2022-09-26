package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter first day of the year(sunday-0 and monday-1): ");
        int inputDay = input.nextInt();
        int dayNameNumber = inputDay;
        String firstDayName = ".";

        for (int month = 1; month <= 12; month++) {

            switch(dayNameNumber) {
                case 0: firstDayName = "Sunday"; break;
                case 1: firstDayName = "Monday"; break;
                case 2: firstDayName = "Tuesday"; break;
                case 3: firstDayName = "Wednesday"; break;
                case 4: firstDayName = "Thursday"; break;
                case 5: firstDayName = "Friday"; break;
                case 6: firstDayName = "Saturday";
            }
            switch(month) {
                case 1: System.out.print("January 1, " + year + " is ");
                        dayNameNumber = inputDay;
                        System.out.println(firstDayName);
                        dayNameNumber = (inputDay + 3) % 7; break;

                case 2: System.out.print("February 1, " + year + " is ");
                        if (Exercises_05_27.isLeapYear(year))
                            dayNameNumber = (dayNameNumber + 1) % 7;
                        System.out.println(firstDayName); break;

                case 3: System.out.print("March 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        System.out.println(firstDayName); break;

                case 4: System.out.print("April 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 2) % 7;
                        System.out.println(firstDayName); break;

                case 5: System.out.print("May 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        System.out.println(firstDayName); break;

                case 6: System.out.print("June 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 2) % 7;
                        System.out.println(firstDayName); break;

                case 7: System.out.print("July 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        System.out.println(firstDayName); break;

                case 8: System.out.print("August 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        System.out.println(firstDayName); break;

                case 9: System.out.print("September 1, " + year + " is ");
                        dayNameNumber = (dayNameNumber + 2) % 7;
                        System.out.println(firstDayName); break;

                case 10: System.out.print("October 1, " + year + " is ");
                         dayNameNumber = (dayNameNumber + 3) % 7;
                         System.out.println(firstDayName); break;

                case 11: System.out.print("November 1, " + year + " is ");
                         dayNameNumber = (dayNameNumber + 2) % 7;
                         System.out.println(firstDayName); break;

                case 12: System.out.print("December 1, " + year + " is ");
                         System.out.println(firstDayName);






            }
        }
    }
}
