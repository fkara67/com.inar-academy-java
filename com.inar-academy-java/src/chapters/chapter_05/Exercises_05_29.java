package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter first day of the year(sunday-0 and monday-1): ");
        int inputDay = input.nextInt();

        int dayNameNumber = inputDay;
        int numberOfDay = 0;
        String nameOfMonth = "";
        int count = 1;

        for (int month = 1; month <= 12; month++) {


            switch(month) {
                case 1: numberOfDay = 31;
                        dayNameNumber = inputDay;
                        nameOfMonth = "January";
                        dayNameNumber = (inputDay + 3) % 7; break;

                case 2: nameOfMonth = "February";
                    if (Exercises_05_27.isLeapYear(year)) {
                        dayNameNumber = (dayNameNumber + 1) % 7;
                        numberOfDay = 29;
                    }
                    else
                    numberOfDay = 28; break;

                case 3: numberOfDay = 31;
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        nameOfMonth = "March"; break;

                case 4: numberOfDay = 30;
                        dayNameNumber = (dayNameNumber + 2) % 7;
                        nameOfMonth = "April"; break;

                case 5: numberOfDay = 31;
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        nameOfMonth = "May"; break;

                case 6: numberOfDay = 30;
                        dayNameNumber = (dayNameNumber + 2) % 7;
                        nameOfMonth = "June"; break;

                case 7: numberOfDay = 31;
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        nameOfMonth = "July"; break;

                case 8: numberOfDay = 31;
                        dayNameNumber = (dayNameNumber + 3) % 7;
                        nameOfMonth = "August"; break;

                case 9: numberOfDay = 30;
                        dayNameNumber = (dayNameNumber + 2) % 7;
                        nameOfMonth = "September"; break;

                case 10: numberOfDay = 31;
                         dayNameNumber = (dayNameNumber + 3) % 7;
                         nameOfMonth = "October"; break;

                case 11: numberOfDay = 30;
                    dayNameNumber = (dayNameNumber + 2) % 7;
                    nameOfMonth = "November"; break;

                case 12: numberOfDay = 31;
                         nameOfMonth = "December";
            }
            System.out.println("\n\t\t\t\t\t" + nameOfMonth + " " + year +
                    "\n   ------------------------------------------------------");
            System.out.println("\tSun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");


            for (int i = 0; i < inputDay; i++) {
                System.out.print("\t\t");
                count++;


            }
            for (int i = 1; i <= numberOfDay; i++) {
                System.out.printf("%8d", i);

                if (count % 7 == 0)
                    System.out.println();
                count++;


            }


        }
    }
}
