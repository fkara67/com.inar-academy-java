package chapters.LastPart.Lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java AlphabeticalOrder fileName");
            System.exit(1);
        }
        // Check if file exists and file is a file
        File file = new File(args[0]);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found");
            System.exit(2);
        }

        List<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String line = input.next();
                list.add(line);
            }
        }
        sortAlphabetical(list);
        display(list);
    }
    public static void sortAlphabetical(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!Character.isLetter((list.get(i).charAt(0)))) {
                list.remove(list.get(i));
                i--;
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareToIgnoreCase(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    public static void display(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
