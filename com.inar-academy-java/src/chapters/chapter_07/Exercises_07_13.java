package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The random number is " + getRandom(numbers));
    }
    public static int getRandom(int...numbers) {
        int random = (int)(Math.random() * 53) + 1;
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int)(Math.random() * 53) + 1;
                i = -1;
            }
        }
        return random;
    }
}
