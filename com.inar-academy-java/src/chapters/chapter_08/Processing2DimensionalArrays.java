package chapters.chapter_08;

import java.util.Scanner;

public class Processing2DimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        initializeArrayWithInput(matrix);
        printArray(matrix);
        int sum = sumOfAllElements(matrix);
        System.out.println("\nSum of all elements in the two dimensional array matrix is " + sum + "\n");
        printSumOfElementsInColumns(matrix);
        shuffleJustInRows(matrix);
        printArray(matrix);
        System.out.println("-----------------------");
        shuffleTwoDimensionalArr(matrix);
        printArray(matrix);
    }
    
    public static void initializeArrayWithInput(int[][] twoDimArr) {
        //Initializing arrays with input values. The following loop initializes the array with user
        //input values:
        System.out.print("Enter " + twoDimArr.length + " row and " + twoDimArr[0].length + " columns: ");
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < twoDimArr.length; row++) {
            for (int col = 0; col < twoDimArr[row].length; col++) {
                twoDimArr[row][col] = input.nextInt();
            }
        }
    }
    public static void printArray(int[][] twoDimArr) {
        //Printing arrays. To print a two-dimensional array, you have to print each element in the
        //array using a loop like the following:
        for (int[] i : twoDimArr) {
            for (int j : i) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }
    public static int sumOfAllElements(int[][] twoDimArr) {
        //Summing all elements. Use a variable named total to store the sum. Initially total is
        //0. Add each element in the array to total using a loop like this:
        int total = 0;
        for (int[] i : twoDimArr) {
            for (int j : i) {
                total += j;
            }
        }
        return total;
    }
    public static void printSumOfElementsInColumns(int[][] twoDimArr) {
        //Summing elements by column. For each column, use a variable named total to store
        //its sum. Add each element in the column to total using a loop like this:
        for (int col = 0; col < twoDimArr[0].length; col++) {
            int total = 0;
            for (int row = 0; row < twoDimArr.length; row++) {
                total += twoDimArr[row][col];
            }
            System.out.println("Sum for column " + col + " is " + total);
        }
    }
    public static void shuffleTwoDimensionalArr(int[][] twoDimArr) {
        //for each element matrix[row][col], randomly generate indices randomRow and
        //randomCol and swap matrix[row][col] with matrix[i][j], as follows:

        for (int row = 0; row < twoDimArr.length; row++) {
            for (int col = 0; col < twoDimArr[row].length; col++) {
                int randomRow = (int) (Math.random() * twoDimArr.length);
                int randomCol = (int) (Math.random() * twoDimArr.length);

                int temp = twoDimArr[row][col];
                twoDimArr[row][col] = twoDimArr[randomRow][randomCol];
                twoDimArr[randomRow][randomCol] = temp;
            }
        }
    }
    public static void shuffleJustInRows(int[][] twoDimArr) {
        for (int row = 0; row < twoDimArr.length; row++) {
            for (int col = 0; col < twoDimArr[row].length; col++) {

                int randomCol = (int) (Math.random() * twoDimArr.length);

                int temp = twoDimArr[row][col];
                twoDimArr[row][col] = twoDimArr[row][randomCol];
                twoDimArr[row][randomCol] = temp;
            }
        }
    }
}
