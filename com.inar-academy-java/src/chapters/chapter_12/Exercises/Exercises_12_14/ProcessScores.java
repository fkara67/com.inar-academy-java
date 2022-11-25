package chapters.chapter_12.Exercises.Exercises_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessScores {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java ProcessScores FileName");
            System.exit(0);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("There is no such file!");
            System.exit(1);
        }
        ArrayList<Integer> scores = new ArrayList<>();

        try (
                Scanner input = new Scanner(file)
                ){
            while (input.hasNext()) {
                int i = input.nextInt();
                scores.add(i);
            }
        }
        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
        }
        double average = total / scores.size();
        System.out.println("Total of scores is " + total);
        System.out.println("Average of scores is " + average);
    }
}
