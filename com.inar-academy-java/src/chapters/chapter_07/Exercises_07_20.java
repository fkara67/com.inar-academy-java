package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1;  i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] > list[i]) {
                    double temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }

        }
    }
}
