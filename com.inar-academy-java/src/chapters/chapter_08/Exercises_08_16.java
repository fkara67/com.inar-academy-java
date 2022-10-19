package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] array = new int[row][column];
        System.out.println("Enter the array: ");
        fillArray(array,input);
        System.out.println("Before the sort \n");
        print(array);
        sort(array);
        System.out.println("\nAfter the sort \n");
        print(array);
    }
    public static void fillArray(int[][] array, Scanner input) {


        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
            }
        }
    }
    public static void print(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.print(" ");
        }
    }
    public static void sort(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            int min0 = array[row][0];
            int min1 = array[row][1];
            int index = row;

            for (int i = row + 1; i < array.length; i++) {
                if (array[i][0] < min0 || (array[i][1] < min1 && array[i][0] == min0)) {
                    min0 = array[i][0];
                    min1 = array[i][1];
                    index = i;
                }
            }
            if (index != row) {
                array[index][0] = array[row][0];
                array[index][1] = array[row][1];
                array[row][0] = min0;
                array[row][1] = min1;
            }
        }
    }
}
