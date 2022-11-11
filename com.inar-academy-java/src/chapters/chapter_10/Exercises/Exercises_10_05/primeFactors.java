package chapters.chapter_10.Exercises.Exercises_10_05;

import chapters.chapter_10.Listing.StackOfIntegers;

import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();
        int divisor = 2;
        while (divisor <= num) {
            while (num % divisor == 0) {
                stack.push(divisor);
                num /= divisor;
            }
            divisor++;
        }
        display(stack);
    }
    public static void display(StackOfIntegers stack) {
        while (stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
