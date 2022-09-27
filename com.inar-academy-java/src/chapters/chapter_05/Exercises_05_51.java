package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();
        String commonPrefix = "";
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix += str1.charAt(i);
            }
            else
                break;
        }
        if (commonPrefix.length() > 0)
        System.out.println("The common prefix is '" + commonPrefix + "'");
        else
            System.out.println(str1 + " and " + str2 + " have no common prefix");
    }
}
