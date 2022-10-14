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
        // number of paths will be (number of slots - 1)
        char[] ballPaths = new char[numberOfSlots - 1];


        //Determine and display the paths as many as number of balls
        for (int i = 0; i < numberOfBalls; i++) {
            chance(ballPaths,slots);
            display(ballPaths);
        }
        //simulate the state of the balls
        simulate(slots, numberOfBalls);



    }
    public static void chance(char[] ballPaths, int[] slots) {
        char[] leftOrRight = {'L', 'R'};
        for (int i = 0; i < ballPaths.length; i++) {
            int random = (int)(Math.random() * 2);
            ballPaths[i] = leftOrRight[random];
        }
        int countR = 0;
        for (char c : ballPaths) {
            if (c == 'R') {
                countR++;
            }
        }
        slots[countR]++;
    }
    public static void display(char[] chars) {
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
    }
    public static void simulate(int[] slots, int numberOfBalls) {
        for (int i = numberOfBalls; i > 0; i--) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == i) {
                    System.out.print("0");
                    slots[j]--;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
