package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_32 {
    public static void main(String[] args) {
        int lotteryDigit1 = (int)(Math.random() * 10);
        int lotteryDigit2 = (int)(Math.random() * 10);
        while (lotteryDigit1 == lotteryDigit2) {
            lotteryDigit2 = (int)(Math.random() * 10);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);

        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2) {
            System.out.println("Exact match: you win $10000");

        }
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
            System.out.println("Match all digits: you win $3000");
        }
        else if (lotteryDigit1 == guessDigit1
                || lotteryDigit2 == guessDigit2
                || lotteryDigit1 == guessDigit2
                || lotteryDigit2 == guessDigit1) {
            System.out.println("Match one digit: you win $1000");
        }
        else
            System.out.println("Sorry, no match");
    }
}
