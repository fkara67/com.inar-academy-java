package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_08_09 {
    /* 1- create 3*3 array for game grid
       2- create game table
       3- put inputs respectively game table
     */
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        fill(grid, ' ');
        boolean xTurn = true;
        boolean isDraw = true;

        while (!isFull(grid)) {
            printGameBox(grid);
            promptTheUser(grid, xTurn);
            if (checkWins(grid)) {
                printGameBox(grid);
                System.out.println((xTurn ? "X" : "O") + " player won");
                isDraw = false;
                break;
            }
            xTurn = !xTurn;
        }
        if (isDraw) {
            System.out.println("Game over! It's a Draw!");
        }
    }

    private static void fill(char[][] grid, char c) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(grid[i], c);
        }
    }

    public static boolean isFull(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void promptTheUser(char[][] grid, boolean xTurn) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a row (0, 1, 2) for player ");
            System.out.print(xTurn ? "X: " : "O: ");
            int row = input.nextInt();

            System.out.print("Enter a col (0, 1, 2) for player ");
            System.out.print(xTurn ? "X: " : "O: ");
            int col = input.nextInt();

            if (col < 0 || col > 2 || row < 0 || row > 2) {
                System.out.println("Please choose another row and col!");
                continue;
            }

            if (grid[row][col] == ' ') {
                grid[row][col] = xTurn ? 'X' : 'O';
                break;
            }
            System.out.println("Please choose another row and col!");
        }
    }
    public static boolean checkWins(char[][] grid) {
        return checkRows(grid) || checkCols(grid) || checkMajorDiagonal(grid) || checkSubDiagonal(grid);
    }

    private static boolean checkSubDiagonal(char[][] grid) {
        for (int row = 0, col = grid.length - 1; row < grid.length - 1; row++, col--) {
            if (grid[row][col] == ' ' || grid[row][col] != grid[row + 1][col - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkMajorDiagonal(char[][] grid) {
        for (int i = 0; i < grid.length - 1; i++) {
            if (grid[i][i] == ' ' || grid[i][i] != grid[i + 1][i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCols(char[][] grid) {
        boolean isOver;

        for (int col = 0; col < grid.length; col++) {
            isOver = true;
            for (int row = 0; row < grid.length - 1; row++) {
                if (grid[0][col] == ' ' || grid[row][col] != grid[row + 1][col]) {
                    isOver = false;
                }
            }
            if (isOver) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkRows(char[][] grid) {
        boolean isOver;

        for (int row = 0; row < grid.length; row++) {
            isOver = true;
            for (int col = 0; col < grid[row].length - 1; col++) {
                if (grid[row][0] == ' ' || grid[row][col] != grid[row][col + 1]) {
                    isOver = false;
                }
            }
            if (isOver) {
                return true;
            }
        }
        return false;
    }
    public static void printGameBox(char[][] grid) {
        System.out.println("_____________");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("| " + grid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println("\n-------------");
        }
    }
}


