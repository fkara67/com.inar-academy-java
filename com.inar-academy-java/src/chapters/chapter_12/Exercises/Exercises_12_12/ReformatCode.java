package chapters.chapter_12.Exercises.Exercises_12_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatCode {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java ReformatCode File");
            System.exit(0);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("There is no such file!");
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();

        try (
            Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                sb.append(input.nextLine()).append("\n");
            }
            sb = new StringBuilder(sb.toString().replaceAll("\\s+\\{", " {"));
        }
        try (
            PrintWriter output = new PrintWriter(file)
        ) {
            output.print(sb);
        }
    }
}
