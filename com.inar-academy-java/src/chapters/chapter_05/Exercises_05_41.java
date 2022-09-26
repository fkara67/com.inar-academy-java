package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers(0 ends the input): ");
        int data = input.nextInt();
        int max = 0;
        int count = 0;
        while (data != 0) {
            data = input.nextInt();
            if (data > max) {
                max = data;
                count = 1;
            }
            else if (data == max) {
                count++;
            }
        }
        System.out.println("The largest number is " + max + "\nThe occurence count of the largest number is " + count);
    }
}
