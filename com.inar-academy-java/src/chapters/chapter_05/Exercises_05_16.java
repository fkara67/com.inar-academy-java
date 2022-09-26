package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        int divisor = 2;
        while (divisor <= n) {
            while (n % divisor == 0) {
                n /= divisor;
                System.out.print(divisor + ",");
            }
            divisor++;
        }
    }
}
