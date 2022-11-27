package chapters.chapter_12.Exercises.Exercises_12_31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameRanking {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter gender: ");
        char gender = input.next().charAt(0);

        System.out.print("Enter name: ");
        String name = input.next();

        File file = new File("babyNameRanking" + year + ".txt");

        try {
            findNameRank(file,gender,name,year);
        }
        catch (FileNotFoundException ex) {
            System.out.println("The file for the year you entered does not exist!");
        }
    }
    public static void findNameRank(File file, char gender, String name, int year) throws FileNotFoundException {
        try (
                Scanner input2 = new Scanner(file)
        ) {
            while (input2.hasNext()) {
                int rank = input2.nextInt();
                String maleName = input2.next();
                String femaleName = input2.next();
                if ((Character.toUpperCase(gender) == 'M' && maleName.equalsIgnoreCase(name)) ||
                        (gender == 'F' && femaleName.equalsIgnoreCase(name))) {
                    System.out.println(name + " is ranked #" + rank + " in the year " + year);
                    return;
                }
            }
            System.out.println("The name " + name + " is not ranked in the year " + year);
        }
    }
}
