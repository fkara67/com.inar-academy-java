package chapters.chapter_07;

import java.util.Scanner;

public class Exercises_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];
        
        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        findGrade(scores, grades);
        // displaying results
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);

        }
    }
    public static void findGrade(int[] scores, char[] grades) {
        int best = findBest(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                grades[i] = 'A';
            else if (scores[i] >= best - 20)
                grades[i] = 'B';
            else if (scores[i] >= best - 30)
                grades[i] = 'C';
            else if (scores[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
    }
    public static int findBest(int[] arr) {
        int best = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > best)
                best = arr[i];
        }
        return best;
    }
}
