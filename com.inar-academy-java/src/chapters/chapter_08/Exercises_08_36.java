package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();

        char[][] array = new char[n][n];
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        fillArrayWithInput(array, input);

        System.out.println("The input array is " + ((isLatinSquare(array)) ? "a latin square" : "not a latin square"));
    }
    public static void fillArrayWithInput(char[][] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.next().charAt(0);

                if (array[i][j] >= ('A' + array.length) || array[i][j] < 'A') {
                    System.out.println("Wrong input: the letters must be from A to "
                            + (char)('A' + array.length - 1));
                    System.exit(0);
                }
            }
        }
    }
    public static boolean isLatinSquare(char[][] array) {
        for (int row = 0; row < array.length - 1; row++) {
            for (int col = 0; col < array[row].length - 1; col++) {

                for (int i = col + 1; i < array[row].length; i++) {
                    if (array[row][col] == array[row][i]) {
                        return false;
                    }
                }
                for (int i = row + 1; i < array.length; i++) {
                    if (array[row][col] == array[i][col]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
