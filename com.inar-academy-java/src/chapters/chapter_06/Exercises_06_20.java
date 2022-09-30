package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println(countLetters(s));
    }
    public static int countLetters(String s) {
        int letterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                letterCount++;
            }

        }
        return letterCount;
    }
}
