package chapters.chapter_12.Exercises.Exercises_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveStringFromText {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveStringFromText String File");
            System.exit(0);
        }
        String removed = args[0];
        File file = new File(args[1]);

        if (!file.exists()) {
            System.out.println("There is no such file!");
            System.exit(1);
        }
        StringBuilder sb = new StringBuilder();
        try (
            Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
               String str = input.nextLine();
               sb.append(str.replaceAll(removed + " ", "") + "\n");
            }
        }
        try (
            PrintWriter output = new PrintWriter(file);
        ) {
            output.print(sb);
        }
    }
}
