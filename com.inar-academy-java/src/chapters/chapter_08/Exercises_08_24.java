package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_24 {
    /* (Check Sudoku solution)
        1- prompt the user to enter a sudoku solution
        2- store this solution in a two-dim arr
        3- check whether every row, every col has the numbers 1 to 9.
        4- display whether solution is valid
     */
    public static void main(String[] args) {

        int[][] grid = readSolution();

        System.out.println(isSolutionValid(grid) ? "Valid Solution" : "Invalid Solution");
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
    public static boolean isSolutionValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                }
            }
        }
        return isRowValid(grid) && isColValid(grid) && isBoxValid(grid);
    }
    public static boolean isRowValid(int[][] grid) {
        boolean[][] rows = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                rows[i][grid[i][j] - 1] = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!rows[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isColValid(int[][] grid) {
        boolean[][] cols = new boolean[9][9];
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                cols[j][grid[i][j] - 1] = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!cols[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBoxValid(int[][] grid) {
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i += 3) {
            for (int row = (i / 3) * 3, k = i / 3; row < (i / 3) * 3 + 3; row++) {
                for (int col = 0; col < 3; col++) {
                    boxes[k][grid[row][col] - 1] = true;
                }
            }
            for (int row = (i / 3) * 3, k = i / 3 + 3; row < (i / 3) * 3 + 3; row++) {
                for (int col =  3; col < 6; col++) {
                    boxes[k][grid[row][col] - 1] = true;
                }
            }
            for (int row = (i / 3) * 3, k = i / 3 + 6; row < (i / 3) * 3 + 3; row++) {
                for (int col =  6; col < 9; col++) {
                    boxes[k][grid[row][col] - 1] = true;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(!boxes[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
