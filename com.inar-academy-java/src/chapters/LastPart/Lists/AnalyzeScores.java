package chapters.LastPart.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        List<Double> scores = getScoresFromUser();
        analyzeScores(scores);
    }

    private static List<Double> getScoresFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores between 0 and 100(negative ends input): ");

        List<Double> scores = new ArrayList<>();

        while (true) {
            double score = input.nextInt();
            if (score < 0) {
                break;
            }
            else if (score > 100) {
                System.out.println("Score must be between 0 and 100 inclusive!");
                System.out.print("Enter scores(negative ends input): ");
            }
            else
                scores.add(score);
        }
        return scores;
    }
    private static void analyzeScores(List<Double> scores) {
        double sum = 0;
        for (Double score : scores) {
            sum += score;
        }
        double average = sum / scores.size();

        int numOfAboveAverage = 0;
        int numOfBelowAverage = 0;

        for (Double score : scores) {
            if (score < average) {
                numOfBelowAverage++;
            }
            else
                numOfAboveAverage++;
        }
        System.out.println(numOfAboveAverage + " score" +
                ((numOfAboveAverage > 1) ? "s" : "") +  " are above or equal to the average.");
        System.out.println(numOfBelowAverage + " score" +
                ((numOfBelowAverage > 1) ? "s" : "") +  " are below the average");
    }
}
