package chapters.chapter_12.Exercises.Exercises_12_03;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[100];
        fillArrRandomly(arr);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println("index " + index + " of the array is " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
    public static void fillArrRandomly(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
    }
}
