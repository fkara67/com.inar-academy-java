package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_18 {
    public static void main(String[] args) {
        final int NUMBER_OF_INPUTS = 10;
        System.out.print("Enter " + NUMBER_OF_INPUTS + " double values: ");
        double[] numbers = createArrayWithInput(NUMBER_OF_INPUTS);
    }
    public static double[] createArrayWithInput(int numberOfInputs) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[numberOfInputs];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }
    public static void bubbleSort(double[] list) {

    }
}
