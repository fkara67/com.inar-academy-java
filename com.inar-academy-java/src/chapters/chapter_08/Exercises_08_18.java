package chapters.chapter_08;

import java.util.Random;

public class Exercises_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        display(m);
        System.out.println("-----------------------");
        shuffle(m);
        display(m);
    }
    public static void shuffle(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int random = (int)(Math.random() * array.length);

                int[] temp = array[row];
                array[row] = array[random];
                array[random] = temp;
            }
        }
    }
    public static void display(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}

