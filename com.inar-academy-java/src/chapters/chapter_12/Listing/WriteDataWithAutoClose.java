package chapters.chapter_12.Listing;

import java.io.*;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("scores2.txt");
        if (file.exists()) {
            System.out.println("File already exists!");
            return;
        }

        try (
            PrintWriter output = new PrintWriter(file)
        ) {
            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
