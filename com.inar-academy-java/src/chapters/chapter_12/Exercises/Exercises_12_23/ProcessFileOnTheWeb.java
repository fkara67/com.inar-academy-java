package chapters.chapter_12.Exercises.Exercises_12_23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ProcessFileOnTheWeb {
    public static void main(String[] args) throws MalformedURLException {
        System.out.print("Enter a scores file URL: ");
        String urlString = new Scanner(System.in).next();
        try {
            URL url = new URL(urlString);
            double total = 0;
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                total += input.nextDouble();
                count++;
            }
            System.out.println("Total of scores is " + total);
            System.out.println("Average of the scores is " + (total / count));
        }
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL!");
        }
        catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
