package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The index of the smallest element is " + indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(int[] array) {
        int min = array[0];
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
