package chapters.chapter_12.Exercises.Exercises_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSorted {
    public static void main(String[] args) throws FileNotFoundException {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java DataSorted FileName");
            System.exit(1);
        }
        // Check if file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }
        ArrayList<String> list = new ArrayList<>();
        String s1;
        String s2;
        try (
                // Create input file
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
            System.out.println("Is " + file + " sorted? " + isSorted(list));
        }
    }
    public static boolean isSorted(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
