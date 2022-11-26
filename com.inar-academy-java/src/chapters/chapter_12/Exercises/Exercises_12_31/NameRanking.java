package chapters.chapter_12.Exercises.Exercises_12_31;

import java.io.File;
import java.util.Scanner;

public class NameRanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        String year = input.next();

        System.out.print("Enter gender: ");
        String gender = input.next();

        System.out.print("Enter name: ");
        String name = input.next();

        File file = new File("babyNameRanking" + year + ".txt");

    }
}
