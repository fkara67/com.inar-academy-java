package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_30 {
    public static void main(String[] args) {
        playCrasp();

    }
    public static void playCrasp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character to roll the dice.");
        String start = input.next();

        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        int sum = dice1 + dice2;
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            System.out.println("You lose!");
            return;
        }
        else if (sum == 7 || sum == 11) {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            System.out.println("You win!");
        }
        else {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            System.out.println("The point is " + sum);


            while (dice1 + dice2 != 7 || dice1 + dice2 != sum) {
                System.out.println("Continue roll. Please enter any character to roll.");
                Scanner input3 = new Scanner(System.in);
                String start3 = input3.next();
                dice1 = (int)(Math.random() * 6) + 1;
                dice2 = (int)(Math.random() * 6) + 1;

                if (dice1 + dice2 == 7) {
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                    System.out.println("You lose!");
                    return;
                }
                else if (dice1 + dice2 == sum) {
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                    System.out.println("You win!");
                    return;
                }
                else {
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                }
            }


        }

    }
}
