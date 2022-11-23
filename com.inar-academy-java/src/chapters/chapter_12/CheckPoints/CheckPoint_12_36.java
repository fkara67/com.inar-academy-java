package chapters.chapter_12.CheckPoints;

import java.util.Scanner;

public class CheckPoint_12_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();

        System.out.println(intValue + "\n" + doubleValue);
        System.out.println(line);
    }
}
