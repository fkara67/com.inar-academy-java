package chapters.chapter_12.Exercises.Exercises_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("babyNameRanking2002.txt");

        if (file.exists()) {
            System.out.println("File already exists!");
            System.exit(0);
        }
        // Create a file
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 0; i < 100; i++) {
                output.print((int) (Math.random() * 1000));
                output.print(" ");
                if ((i + 1) % 10 == 0) {
                    output.println();
                }
            }
        }
    }
}
