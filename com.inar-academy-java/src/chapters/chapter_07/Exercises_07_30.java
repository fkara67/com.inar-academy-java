package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_30 {
    /*1- prompt the user to enter imput size
      2- prompt the user to enter a series of integers as long as the user gives
      3- check whether series contains four consecutive numbers with the same value.
      4- display the result
         5 6 7 8 8 8 8 6 ->  true it has consecutive four
         3 5 6 8 8 2 8 8 ->  false it has no consecutive four
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int inputSize = input.nextInt();

        int[] numbers = createArrayWithInput(inputSize);

        if (isConsecutiveFour(numbers)) {
            System.out.println("The list has consecutive fours.");
        }
        else System.out.println("The list has no consecutive fours.");
    }
    public static int[] createArrayWithInput(int size) {
        int[] values = new int[size];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        return values;
    }
    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;
        for (int i = 0; i + 1 < values.length; i++) {
            if (values[i] == values[i + 1]) {
                count++;
            }
            else count = 1;
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

}
