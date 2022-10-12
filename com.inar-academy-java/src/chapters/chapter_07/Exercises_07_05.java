package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] numbers = createArrayWithInput();
        int[] distinctNumbers = new int[10];
        int count = 0;

        for (int j = 0; j < numbers.length; j++) {
            if (isDistinct(distinctNumbers,numbers[j], count)) {
                distinctNumbers[count] = numbers[j];
                count++;
            }
        }
        displayResult(distinctNumbers,count);


    }

    public static boolean isDistinct(int[] distinctNumbers, int n, int count) {
        for (int i = 0; i < count; i++) {
            if (n == distinctNumbers[i]) {
                return false;
            }
        }
        return true;
    }
    public static void displayResult(int[] arr, int count) {
        System.out.println("The number of distinct numbers is " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

}
