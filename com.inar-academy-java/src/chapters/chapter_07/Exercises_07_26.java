package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_26 {
    /* 1- prompt the user to enter two lists of integers
       2- if all elements of these two array and its index are the same
            return true
          else return false
       3- display the result
     */
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[] list1 = createArrayWithInput();
        System.out.print("Enter list2: ");
        int[] list2 = createArrayWithInput();

        if (isEquals(list1,list2)) {
            System.out.println("Two lists are strictly identical");
        }
        else System.out.println("Two lists are not strictly identical");
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
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
