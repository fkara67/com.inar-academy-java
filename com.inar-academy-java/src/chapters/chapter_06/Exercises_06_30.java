package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_30 {
    public static void main(String[] args) {
        playCrasp();

    }
    public static void playCrasp() {
    getResult(rollTwoDices());


    }
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
    public static int rollTwoDices() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;

    }
    public static void rollTillWinOrLose(int sum) {

        while (sum != 7 || sum != sum) {
            int dice1 = rollDice();
            int dice2 = rollDice();
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));

            if (dice1 + dice2 == 7) {
                System.out.println("You lose!");
                return;
            }
            else if (dice1 + dice2 == sum) {
                System.out.println("You win!");
                return;
            }

        }

    }
    public static void getResult(int sum) {
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose!");
            return;
        }
        else if (sum == 7 || sum == 11) {
            System.out.println("You win!");
        }
        else {
            System.out.println("The point is " + sum);
            rollTillWinOrLose(sum);
        }

    }
}
