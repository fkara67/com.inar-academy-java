package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first positive integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second positive integer: ");
        int n2 = input.nextInt();

        if (n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        for (int i = n2; i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0){
                System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + i);
                break;
            }
        }
    }
}
