package chapters.chapter_12.Exercises.Exercises_12_32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RankingSummary {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("-----------------------------------------------------------" +
                "----------------------------------------------------------------------");
        System.out.println("Year\t  Rank 1\t  Rank 2\t  Rank 3\t  Rank 4\t  Rank 5\t  Rank 1\t  Rank 2\t  Rank 3\t  Rank 4\t  Rank 5");
        System.out.println("-----------------------------------------------------------" +
                "----------------------------------------------------------------------");


        for (int year = 2005; year >= 2001; year--) {
            File file = new File("babyNameRanking" + year + ".txt");
            display(file,year);
        }
    }
    public static void display(File file, int year) throws FileNotFoundException {
        try(
                Scanner input = new Scanner(file);
        ) {
            System.out.print(year + "      ");
            int i = 1;
            while (i <= 5) {
                int rank = input.nextInt();
                String maleName = input.next();
                String femaleName = input.next();
                System.out.printf("%-12s", femaleName);
                i++;
            }
        }
        try(
                Scanner input = new Scanner(file)
                ) {

            int i = 1;
            while (i <= 5) {
                int rank = input.nextInt();
                String maleName = input.next();
                String femaleName = input.next();
                System.out.printf("%-12s", maleName);
                i++;
            }
            System.out.println();
        }
    }
}
