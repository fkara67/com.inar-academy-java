package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_31 {
    /* list1 = {1, 3, 5, 7}  and list2 = {2, 4, 6, 8}
       merged list = {1, 2, 3, 4, 5, 6, 7, 8}
       1- prompt the user to enter 2 sorted lists
       2- merge this 2 lists and then sort new list
       3- display new merged sorted list
     */
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[] list1 = createArrayWithInput();
        System.out.print("Enter list2: ");
        int[] list2 = createArrayWithInput();

        int[] mergedList = merge(list1,list2);
        displayArray(mergedList);
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
    public static int[] merge(int[] list1, int[] list2) {
        int sizeOfMergedList = list1.length + list2.length;
        int[] mergedList = new int[sizeOfMergedList];

        for (int i = 0; i < list1.length; i++) {
            mergedList[i] = list1[i];
        }
        for (int i = list1.length, j = 0; i < sizeOfMergedList; i++, j++) {
            mergedList[i] = list2[j];
        }
        sort(mergedList);
        return mergedList;
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void displayArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
