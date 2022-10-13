package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_33 {
    /*  1963 % 12 = 7 --> 7 => rabbit
        1- prompt to user enter a year
        2- wirte a method that find which zodiac of this year
        3- display the zodiac
     */
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.println(year + " is \"" + whichZodiac(year) + "\" in the chinese zodiac.");
    }
    public static String whichZodiac(int year) {
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat",
                "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        return zodiac[year % 12];

    }
}
