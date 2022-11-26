package chapters.chapter_12.Exercises.Exercises_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercise12_15.txt");

        if (!file.exists()) {
            System.out.println("File " + file + " not found!");
        }

        ArrayList<Integer> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file)
        ){
            int count = 0;
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%4d" ,list.get(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
