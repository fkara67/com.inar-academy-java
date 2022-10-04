package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter number's width: ");
        int width = input.nextInt();
        String format = format(number,width);
        System.out.println(format);

    }
    public static String format(int number, int width) {
        String s = number + "";
            while (s.length() < width) {
                s = "0" + s;
            }
            return s;
    }
}
