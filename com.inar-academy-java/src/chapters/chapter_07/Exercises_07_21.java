package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_21 {
    /* 1- prompt the user to enter the number of balls
       2- prompt the user to enter the number of slots
       3- create array for slots
       4- create array for ballPaths
       5- simulate the balls
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        int[] slots = new int[numberOfSlots];
        String[] ballPaths = new String[numberOfSlots];


    }
}
