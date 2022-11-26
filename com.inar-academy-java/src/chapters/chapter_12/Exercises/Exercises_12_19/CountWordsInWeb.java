package chapters.chapter_12.Exercises.Exercises_12_19;

import java.util.Scanner;

public class CountWordsInWeb {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += countWords(line);
            }
            System.out.println("The file size is " + count + " words.");
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL!");
        }
        catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
    public static int countWords(String str) {
        String[] words = str.trim().split(" ");
        return words.length;
    }
}
