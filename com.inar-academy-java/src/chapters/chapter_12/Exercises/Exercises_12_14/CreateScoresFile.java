package chapters.chapter_12.Exercises.Exercises_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateScoresFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("abc.txt");

        try (PrintWriter output = new PrintWriter(file)) {
            output.println(90);
            output.println(80);
            output.println(70);
            output.println(60);
            output.println(50);
        }
    }
}
