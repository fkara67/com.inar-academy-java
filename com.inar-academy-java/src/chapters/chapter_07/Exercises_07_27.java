package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_27 {
    /* 1- prompt the user to enter two lists of integers
       2- if all the elements of these two array are the same
          (index of the elements can be different)
          return true;
          else return false;
       3- display the result
     */
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[] list1 = createArrayWithInput();
        System.out.print("Enter list2: ");
        int[] list2 = createArrayWithInput();

        if (isEquals(list1,list2)) {
            System.out.println("Two lists are identical");
        }
        else System.out.println("Two lists are not identical");
    }
    public static int[] createArrayWithInput() {
        Scanner input = new Scanner(System.in);
        int listSize = input.nextInt();
        int[] list = new int[listSize];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
    public static boolean isEquals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        sort(list1);
        sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp1 = list[i];
                    list[i] = list[j];
                    list[j] = temp1;
                }
            }
        }
    }
}
