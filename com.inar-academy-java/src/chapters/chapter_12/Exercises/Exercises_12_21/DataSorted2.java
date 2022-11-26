package chapters.chapter_12.Exercises.Exercises_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSorted2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercise12_21.txt");
        if (!file.exists()) {
            System.out.println(file + " not found");
            return;
        }

        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file)
                ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
        }
        System.out.println("Is " + file + " sorted? " + isSorted(list));
    }

    public static boolean isSorted(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
