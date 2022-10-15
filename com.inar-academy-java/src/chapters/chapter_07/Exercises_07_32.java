package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_32 {
    /* 1- prompt the user to enter the list(first input determines the list size)
       2- find how many elements are less than or equal to the pivot
       3- put the pivot its own place
       4- put the other elements left or right the pivot
       5- display the new array
     */
    public static void main(String[] args) {
        System.out.print("Enter list: ");
        int[] list = createArrayWithInput();
        int pivotIndex = partition(list);
        System.out.println("The list is " + Arrays.toString(list));
        displayResult(list, pivotIndex);
    }
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int partition(int[] list) {
        // count of the elements less than or equal to pivot
        int count = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[0] > list[i]) {
                count++;
            }
        }
        return count;
    }
    public static void displayResult(int[] list, int index) {
        int temp = list[index];
        list[index] = list[0];
        list[0] = temp;
        for (int i = 0; i < index; i++) {
            for (int j = index + 1; j < list.length; j++) {
                if (list[i] > list[index] && list[j] <= list[index]) {
                    int temp2 = list[i];
                    list[i] = list[j];
                    list[j] = temp2;
                }
            }
        }
        System.out.print("After the partition, the list is ");
        System.out.print(Arrays.toString(list));
    }
}
