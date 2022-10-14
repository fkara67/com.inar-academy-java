package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter " + (i + 1) + ". student's name and score: \n");
            names[i] = getNamesFromUser(numberOfStudents,i);
            scores[i] = getScoreFromUser(numberOfStudents,i);
        }
        sortNamesDecreasingOrder(names,scores);

    }
    public static String getNamesFromUser(int numberOfStudents, int i) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[numberOfStudents];

        System.out.print("Name: ");
        names[i] = input.nextLine();

        return names[i];
    }
    public static int getScoreFromUser(int numberOfStudents, int i) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[numberOfStudents];

        System.out.print("Score: ");
        scores[i] = input.nextInt();

        return scores[i];
    }

    public static void sortNamesDecreasingOrder(String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("Student names in decreasing order of their scores: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ") " + names[i] + "  ");
        }
    }
}
