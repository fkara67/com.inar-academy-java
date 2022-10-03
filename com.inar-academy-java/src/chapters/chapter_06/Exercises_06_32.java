package chapters.chapter_06;

import java.util.Scanner;

public class Exercises_06_32 {
    public static void main(String[] args) {
        int count = 0;
        int win = 0;
        while (count < 3) {
            playCrasp(win);
            count++;
        }
        System.out.println("win is ");

    }
    public static void playCrasp(int win1) {
        getResult(rollTwoDices(),win1);
        System.out.println(getResult(rollTwoDices(),win1));
    }
    public static int rollTwoDices() {
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
        return dice1 + dice2;

    }
    public static int getResult(int sum, int win2) {

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose!");

        }
        else if (sum == 7 || sum == 11) {
            System.out.println("You win!");
            win2++;

        }
        else {
            System.out.println("The point is " + sum);
            for (int dice = rollTwoDices(); dice != 7 || dice != sum;) {
                if (dice == 7) {
                    System.out.println("You lose!");
                    break;
                }
                else if (dice == sum) {
                    System.out.println("You win!");
                    win2++;
                    break;

                }

            }
        }
        return win2;
    }
}
