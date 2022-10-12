package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_19 {
    public static void main(String[] args) {
        System.out.println("Enter list: ");
        int[] list = createArrayWithInput();

        displayResult(isSorted(list));
    }
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static void displayResult(boolean isSorted) {
        if (isSorted) {
            System.out.println("The list is already sorted.");
        }
        else System.out.println("The list is not sorted.");
    }
    public static boolean isSorted(int[] list) {
        for (int i = 0; i + 1 < list.length; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
