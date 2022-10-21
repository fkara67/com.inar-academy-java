package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_09 {
    /* 1- create 3*3 array for game grid
       2- create game table
       3- put inputs respectively game table
     */
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < grid.length; i++) {
            System.out.println("------------------");
            int row = input.nextInt();
            int col = input.nextInt();
            grid[row][col] = input.next().charAt(0);
            if (grid[row][col] != '\u0000') {
                System.out.printf("| %3s |", grid[row][col]);
            }
            System.out.println("------------------");
        }
    }
}
