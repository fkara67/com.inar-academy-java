package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a character you want to find the number of: ");
        String  s = input.nextLine();

        char a = s.charAt(0);
        System.out.print("The number of '" + a + "' in the string \"" + str + "\" is ");

        System.out.println(count(str,a));
    }
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
