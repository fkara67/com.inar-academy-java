package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        int upperCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCount++;
            }

        }
        System.out.println("The number of the uppercase letters is " + upperCount);
    }
}
