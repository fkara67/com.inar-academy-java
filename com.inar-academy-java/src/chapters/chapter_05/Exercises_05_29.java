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
                        for (int i = 0; i < inputDay; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (inputDay + 3) % 7;
                        break;

                case 2: nameOfMonth = "February";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    if (Exercises_05_27.isLeapYear(year)) {
                        dayNameNumber = (dayNameNumber + 1) % 7;
                        numberOfDay = 29;
                    }
                    else
                    numberOfDay = 28;
                    break;

                case 3: numberOfDay = 31;
                    nameOfMonth = "March";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 3) % 7;
                        break;


                case 4: numberOfDay = 30;

                        nameOfMonth = "April";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 2) % 7;
                        break;

                case 5: numberOfDay = 31;

                        nameOfMonth = "May";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 3) % 7;
                        break;

                case 6: numberOfDay = 30;

                        nameOfMonth = "June";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 2) % 7;
                        break;

                case 7: numberOfDay = 31;

                        nameOfMonth = "July";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 3) % 7;
                        break;

                case 8: numberOfDay = 31;

                        nameOfMonth = "August";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 3) % 7;
                        break;

                case 9: numberOfDay = 30;
                        ;
                        nameOfMonth = "September";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 2) % 7;
                        break;

                case 10: numberOfDay = 31;

                         nameOfMonth = "October";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 3) % 7;
                         break;

                case 11: numberOfDay = 30;
                    ;
                    nameOfMonth = "November";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
                    dayNameNumber = (dayNameNumber + 2) % 7;
                    break;

                case 12: numberOfDay = 31;
                         nameOfMonth = "December";
                    for (int i = 0; i < dayNameNumber; i++) {
                        System.out.print("    ");
                        count++;
                    }
            }
            System.out.println("\n\t\t\t\t\t" + nameOfMonth + " " + year +
                    "\n   ------------------------------------------------------");
            System.out.println("\tSun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");






            for (int i = 1; i <= numberOfDay; i++) {
                System.out.printf("%8d", i);

                if (count % 7 == 0)
                    System.out.println();
                count++;


            }


        }
    }
}
