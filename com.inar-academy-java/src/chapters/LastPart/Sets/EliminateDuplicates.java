package chapters.LastPart.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The distinct numbers are: " +
                Arrays.toString(eliminateDuplicates(numbers).toArray()));

    }
    public static Set<Integer> eliminateDuplicates(int[] arr) {
        Set<Integer> distinct = new HashSet<>();
        for (int number : arr) {
            distinct.add(number);
        }
        return distinct;
    }
}
