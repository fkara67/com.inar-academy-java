package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        s = s.toUpperCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'İ' ||
                    s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'I') {
                vowelCount++;
            }
            else if (Character.isLetter(s.charAt(i)) && s.charAt(i) != 'I') {
                consonantCount++;
            }
        }
        System.out.println("The number of vowels is " + vowelCount +
                "\nThe number of consonants is " + consonantCount);
    }
}
