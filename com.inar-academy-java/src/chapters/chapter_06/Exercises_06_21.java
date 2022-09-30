package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.print(getNumber(s.charAt(i)));
            }
            else if (Character.isDigit(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
            else
                System.out.print(s.charAt(i));
        }


    }
    public static int getNumber(char uppercaseLetter) {
        int number = 0;

        if (uppercaseLetter <= 'C')
            number = 2;
        else if (uppercaseLetter <= 'F')
            number = 3;
        else if (uppercaseLetter <= 'I' || uppercaseLetter == 'İ')
            number = 4;

        else if (uppercaseLetter <= 'L')
            number = 5;
        else if (uppercaseLetter <= 'F')
            number = 3;
        else if (uppercaseLetter <= 'O')
            number = 6;
        else if (uppercaseLetter <= 'S')
            number = 7;
        else if (uppercaseLetter <= 'V')
            number = 8;
        else if (uppercaseLetter <= 'Z')
            number = 9;

        return number;


    }

}
