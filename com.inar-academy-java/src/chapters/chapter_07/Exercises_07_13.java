package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_13 {
    public static void main(String[] args) {

        System.out.print("Enter ten numbers: ");
        int[] numbers = createArrayWithInput();
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
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
