package weeks.week_08;

import java.util.Scanner;
//Inar Academy => false
//Tarik => true

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string value: ");
        String s = input.nextLine();
        boolean result1 = isUnique1(s);
        System.out.println(result1);
        System.out.println("---------------------");
        boolean result2 = isUnique2(s);
        System.out.println(result2);
    }
    public static boolean isUnique1(String s){
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                count++;
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println("This is the step number: " + count);
                    return false;
                }
            }
        }
        System.out.println("This is the step number: " + count);
        return true;
    }
    public static boolean isUnique2(String s) {
        int count = 0;
        boolean[] myAsciiTable = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            count++;
            if (myAsciiTable[index]) {
                System.out.println("This is the step number: " + count);
                return false;
            }
            else
                myAsciiTable[index] = true;
        }
        System.out.println("This is the step number: " + count);
        return true;
    }
}
