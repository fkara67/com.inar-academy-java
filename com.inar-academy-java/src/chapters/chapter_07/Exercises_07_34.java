package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_34 {
    /* 1- prompt to user to enter a string.
       2- write a method that returns a sorted string
       3- display the sorted string
          sort("kara") --> returns "aakr"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a srting: ");
        String str = input.nextLine();
        str = sort(str);
        System.out.print("The sorted string is " + str);

    }
    public static String sort(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        // arr = {'k', 'a', 'r', 'a'};

        arr = sort(arr);
        String result = "";
        for (char c : arr) {
            result += c;
        }
        return result;
    }
    public static char[] sort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
