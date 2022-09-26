package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String maxName = "";
        int maxScore = 0;

        for (int i = 1; i < numberOfStudents + 1; i++) {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter " + i + ".student's name: ");
            String name = user.nextLine();
            System.out.println("Enter " + i + ".student's score: ");
            int score = user.nextInt();

            if (score > maxScore) {
                maxScore  = score;
                maxName = name;

            }



        }
        System.out.println("The name of the student with the highest score is " + maxName);
    }
}
