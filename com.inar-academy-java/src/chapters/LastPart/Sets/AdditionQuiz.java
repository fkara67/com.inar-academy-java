package chapters.LastPart.Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        Set<Integer> wrongAnswers = new HashSet<>();

        while (number1 + number2 != answer) {
            if (wrongAnswers.contains(answer)) {
                System.out.println("You already entered " + answer);
            }
            else {
                wrongAnswers.add(answer);
            }
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
