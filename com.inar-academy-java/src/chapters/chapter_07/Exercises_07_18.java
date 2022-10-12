package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_18 {
    public static void main(String[] args) {
        final int NUMBER_OF_INPUTS = 10;
        System.out.print("Enter " + NUMBER_OF_INPUTS + " double values: ");

        double[] numbers = createArrayWithInput(NUMBER_OF_INPUTS);

        bubbleSort(numbers);

        System.out.print(Arrays.toString(numbers));
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
        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i + 1 < list.length; i++) {
                if (list[i] > list[i + 1]) {
                    double temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                }
            }
        }
    }
}
