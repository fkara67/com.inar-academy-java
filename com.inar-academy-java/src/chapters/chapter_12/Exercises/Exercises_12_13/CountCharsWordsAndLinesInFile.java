package chapters.chapter_12.Exercises.Exercises_12_13;

import java.io.File;
import java.util.Scanner;

public class CountCharsWordsAndLinesInFile {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java CountCharsWordsAndLinesInFile File");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("There is no such file!");
            System.exit(2);
        }

        String str;
        int numberOfChars = 0;
        int numberOfWords = 0;
        int numberOfLines = 0;

        try (
            Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                str = input.nextLine();
                numberOfLines++;
                numberOfChars += str.length();
                numberOfWords += countWords(str);
            }
        }
        System.out.println("File " + file.getName() + " has");
        System.out.println(numberOfChars + " characters\n" + numberOfWords + " words\n" + numberOfLines + " lines");
    }
    public static int countWords(String str) {
        String[] words = str.trim().split(" ");
        return words.length;
    }
}
