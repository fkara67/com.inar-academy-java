package chapters.chapter_05;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class Exercises_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 5;
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while (count < NUMBER_OF_QUESTIONS) {
            int num1 = (int)(Math.random() * 15) +1;
            int num2 = (int)(Math.random() * 15) +1;
            System.out.println("What is " + num1 + "+" + num2 + "?");
            int answer = input.nextInt();

            if (num1 + num2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("You are wrong!" + num1 + "+" + num2 + " should be " + (num1 + num2));
        count++;

        output += "\n" + num1 + "+" + num2 + "=" + answer +
                ((num1 + num2 == answer)? " correct" : "wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("\nCorrect count is " + correctCount + "\nTest time is " + testTime / 1000 + "seconds\n" + output);
    }
}
