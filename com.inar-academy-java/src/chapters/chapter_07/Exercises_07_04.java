package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the scores(negative numbers ends input): ");
        final int MAXIMUM_NUMBERS_OF_SCORES = 100;
        int numberOfEnteredScores = 0;
        int sum = 0;
        int[] scores = new int[MAXIMUM_NUMBERS_OF_SCORES];
        int user = 1;
        while (user > 0) {
            user = input.nextInt();
            if (user >= 0) {
                scores[numberOfEnteredScores] = user;
                numberOfEnteredScores++;
                sum += user;
            }
        }
        double average = sum / numberOfEnteredScores;
        System.out.println("Average is " + average);
        int aboveAverage = 0;
        int belowAverage = 0;
        for (int i = 0; i < numberOfEnteredScores; i++) {
            if (scores[i] >= average) {
                aboveAverage++;
            }
            else
                belowAverage++;
        }
        System.out.println(aboveAverage + " score" +
                (((aboveAverage > 0)? "s": " ") +" are above or equal to the average." ));
        System.out.println(belowAverage + " score" +
                (((belowAverage > 0)? "s": " ") +" are below the average." ));
    }
}
