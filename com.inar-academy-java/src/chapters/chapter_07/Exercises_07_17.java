package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        getNamesAndScoresFromUser(numberOfStudents);

    }
    public static void getNamesAndScoresFromUser(int numberOfStudents) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter " + (i + 1) + ". student's name and score: \n");
            System.out.print("Name: ");
            names[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();


        }
        sortNamesDecreasingOrder(names,scores);
    }
    public static void sortNamesDecreasingOrder(String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    int temp = scores[j];
                    scores[j] = scores[i];
                    scores[i] = temp;
                    String tempName = names[j];
                    names[j] = names[i];
                    names[i] = tempName;
                }
            }
        }
        System.out.println("Student names in decreasing order of their scores: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "  ");
        }
    }
}
