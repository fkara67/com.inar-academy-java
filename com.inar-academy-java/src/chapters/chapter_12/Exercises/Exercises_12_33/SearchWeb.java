package chapters.chapter_12.Exercises.Exercises_12_33;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchWeb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word you want to search: ");
        String word = input.nextLine();
        // Traverse the Web from a starting url
        crawler(word, "https://github.com/fkara67");

    }

    public static void crawler(String word, String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (true) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                if (lookFor(word, urlString)) {
                    System.out.println("URL for the page that contains " + word + "is " + urlString);
                    break;
                }
                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
        System.out.println(word + "not found");
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else
                        current = -1;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }

    public static boolean lookFor(String word, String urlString) {
        try (
                Scanner input = new Scanner(urlString);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                if (s.contains(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
