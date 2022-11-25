package chapters.chapter_12.Exercises.Exercises_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessScoresFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a scores file: ");
        File file = new File(input.nextLine());

        if (!file.exists()) {
            System.out.println("File " + file + " is not found");
            System.exit(0);
        }
        int count = 0;
        double total = 0;

        try(
            Scanner inputFile = new Scanner(file)
        ){
            while (inputFile.hasNext()) {
                total += inputFile.nextInt();
                count++;
            }
        }
        System.out.println("Total of scores is " + total);
        System.out.println("Average of scores is " + total / count);
    }
}
