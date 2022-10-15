package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_28 {
    /* 1- prompt the user to enter ten integers
       2- pass these integers to an array
       3- get the all combinations of picking two from ten
       4- display the combinations
     */
    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        int[] numbers = createArrayWithInput();
        displayCombinations(numbers);
    }
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public static void displayCombinations(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + ((count % 5 == 0) ? "\n" : "  "));
            }
        }
    }
}
