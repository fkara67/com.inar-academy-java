package chapters.chapter_12.Listing;

import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists!");
            return;
        }
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Johns ");
        output.print(85);

        // Close the file
        output.close();
    }
}
