package chapters.chapter_07;

import java.util.Scanner;

public class SimplifyCoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number (0 to 6): " );
        int number = input.nextInt();
        System.out.println("The day is " + displayDayName(number));
    }
    public static String displayDayName(int number) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        return days[number];
    }
}
