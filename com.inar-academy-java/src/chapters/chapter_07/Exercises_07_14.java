package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("gcd of numbers is " + gcd(numbers));

    }
    public static int gcd(int... numbers) {
        int gcd = 1;
        int min = getMin(numbers);

        for (int i = 2; i <= min; i++) {
            boolean isGcd = true;
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] % i != 0) {
                  isGcd = false;
                }
            }
            if (isGcd)
                gcd = i;

        }
        return gcd;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
