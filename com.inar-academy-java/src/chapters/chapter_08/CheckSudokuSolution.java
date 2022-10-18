package chapters.chapter_08;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] grid = readSolution();

        System.out.println(isValid(grid) ? "Valid Solution" : "Invalid Solution");
    }
    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sudoku solution:");
        int[][] grid = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col] = input.nextInt();
            }
        }
        return grid;
    }
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if(!isValid(grid, i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(int[][] grid, int i) {
        boolean[] isUnique = new boolean[9];
        for (int col = 0; col < 9; col++) {
            if (grid[i][col] < 1 || grid[i][col] > 9) {
                return false;
            }
            isUnique[grid[i][col]] = true;
        }
        if (!isUnique(isUnique)) {
            return false;
        }
        for (int row = 0; row < 9; row++) {
            isUnique[grid[row][i]] = true;
        }
        for (int j = 0; j < 18; j++) {
            if (!isUnique[j]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isUnique(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                return false;
            }
        }
        return true;
    }
}
