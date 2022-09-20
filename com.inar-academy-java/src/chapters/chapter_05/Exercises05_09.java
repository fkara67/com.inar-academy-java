package chapters.chapter_05;

import java.util.Scanner;

public class Exercises05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String maxName = "";
        int maxScore = 0;
        String secondMaxName = "";
        int secondMaxScore = 0;

        for (int i = 1; i < numberOfStudents + 1; i++) {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter " + i + ".student's name: ");
            String name = user.nextLine();
            System.out.println("Enter " + i + ".student's score:");
            int score = user.nextInt();

            if (score > maxScore) {
                secondMaxScore = maxScore;
                secondMaxName = maxName;
                maxScore = score;
                maxName = name;
            }
           else if (score > secondMaxScore) {
                secondMaxScore = score;
                secondMaxName = name;
            }




        }
        System.out.println("The name of the student with the highest score is " + maxName);
        System.out.println("The name of the student with the 2nd highest score is " + secondMaxName);
    }
}
