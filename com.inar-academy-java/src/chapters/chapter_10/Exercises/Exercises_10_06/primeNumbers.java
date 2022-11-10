package chapters.chapter_10.Exercises.Exercises_10_06;

import chapters.chapter_10.Listing.StackOfIntegers;

public class primeNumbers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        // store the prime numbers
        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        // display the prime numbers
        display(stack);


    }
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static void display(StackOfIntegers stack) {
        int count = 0;
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
