package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_09 {
    /* 1- create 3*3 array for game grid
       2- create game table
       3- put inputs respectively game table
     */
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        char[] tokens = {'X', 'O'};

        while (!isDraw(grid)) {
            xTurn(grid);
            printGameBox(grid);
            oTurn(grid);
            printGameBox(grid);

            }
        result(grid,tokens);
        }


    public static void xTurn(char[][] grid) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row (0, 1, or 2) for player X:");
        int row = input.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player X:");
        int col = input.nextInt();
        if (grid[row][col] != '\u0000') {
            System.out.println("This position occupied!");
            xTurn(grid);
        } else
            grid[row][col] = 'X';

    }

    public static void oTurn(char[][] grid) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row (0, 1, or 2) for player O:");
        int row = input.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player O:");
        int col = input.nextInt();
        if (grid[row][col] != '\u0000') {
            System.out.println("This position occupied!");
            oTurn(grid);
        } else
            grid[row][col] = 'O';
    }
    public static boolean isWinXRow(char[][] grid, char[] tokens) {
        for (int i = 0; i < grid.length; i++) {
            int countX = 0;
            for (int j = 1; j < grid[i].length; j++) {
                if (grid[i][j] == tokens[0]) {
                    countX++;
                }
            }
            if (countX == 3)
                return true;
        }
        return false;
    }
    public static boolean isWinXCol(char[][] grid, char[] tokens) {
        for (int col = 0; col < grid[0].length; col++) {
            int count = 0;
            for (int row = 1; row < grid.length; row++) {
                if (grid[row][col] == tokens[0]) {
                    count++;
                }
            }
            if (count == 3)
                return true;
        }
        return false;
    }
    public static boolean isWinXDiagonal(char[][] grid, char[] tokens) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] != tokens[0]) {
                count++;
            }
        }
        if (count == 3)
            return true;

        return false;
    }
    public static boolean isWinORow(char[][] grid, char[] tokens) {
        for (int i = 0; i < grid.length; i++) {
            int countO = 0;
            for (int j = 1; j < grid[i].length; j++) {
                if (grid[i][j] == tokens[0]) {
                    countO++;
                }
            }
            if (countO == 3)
                return true;
        }
        return false;
    }
    public static boolean isWinOCol(char[][] grid, char[] tokens) {
        for (int col = 0; col < grid[0].length; col++) {
            int count = 0;
            for (int row = 1; row < grid.length; row++) {
                if (grid[row][col] == tokens[1]) {
                    count++;
                }
            }
            if (count == 3)
                return true;
        }
        return false;
    }
    public static boolean isWinODiagonal(char[][] grid, char[] tokens) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] != tokens[1]) {
                count++;
            }
        }
        if (count == 3)
            return true;

        return false;
    }


    public static void result(char[][] grid, char[] tokens) {
        if (isWinXRow(grid,tokens) || isWinXCol(grid,tokens) || isWinXDiagonal(grid,tokens)) {
            System.out.println(tokens[0] + " player won");
        }
        if (isWinORow(grid,tokens) || isWinOCol(grid,tokens) || isWinODiagonal(grid,tokens)) {
            System.out.println(tokens[1] + " player won");
        }
        if (isDraw(grid)) {
            System.out.println("It is a draw");
        }
    }
    public static void printGameBox(char[][] grid) {
        System.out.println("_____________");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '\u0000') {
                    System.out.print("| " + grid[i][j] + " ");
                } else
                    System.out.print("|   ");
            }
            System.out.print("|");
            System.out.println("\n-------------");
        }
    }



    public static boolean isDraw(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '\u0000')
                    return false;
            }
        }
        return true;
    }
}


