package chapters.chapter_12.Exercises.Exercises_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceInText {
    public static void main(String[] args) throws FileNotFoundException {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText FileName  oldStr newStr");
            System.exit(1);
        }
        // Check if file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        StringBuilder sb = new StringBuilder();
        try (
                // Create input file
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                sb.append(s1.replaceAll(args[1],args[2]) + "\n");
            }
        }

        try (
                // Create output file
                PrintWriter output = new PrintWriter(file)
        ) {
                output.print(sb);
        }
    }
}
