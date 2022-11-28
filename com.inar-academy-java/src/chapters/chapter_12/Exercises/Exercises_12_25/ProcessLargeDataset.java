package chapters.chapter_12.Exercises.Exercises_12_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessLargeDataset {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");

        if (!file.exists()) {
            System.out.println("There is no such file!");
            System.exit(0);
        }
        double[] totalSalaries = new double[3];
        int[] counts = new int[3];

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] line = s.split(" ");
                int rank = getRank(line[line.length - 2]);
                counts[rank] = counts[rank] + 1;
                totalSalaries[rank] += Double.parseDouble(line[line.length - 1]);
            }
        }
        double totalAllFaculty = totalSalaries[0] + totalSalaries[1] + totalSalaries[2];
        int countAllFaculty = counts[0] + counts[1] + counts[2];
        System.out.printf("Total salary of assistants,associates,fulls and all faculty respectively: %.2f %.2f %.2f %.2f\n",
                totalSalaries[0],totalSalaries[1],totalSalaries[2],totalAllFaculty);

        System.out.printf("Average salary of assistants, associate, full and all faculty respectively: %.2f %.2f %.2f %.2f",
                (totalSalaries[0] / counts[0]),(totalSalaries[1] / counts[1]),
                (totalSalaries[2] / counts[2]),(totalAllFaculty / countAllFaculty));
    }
    public static int getRank(String s) {
        if (s.equalsIgnoreCase("assistant")) {
            return 0;
        }
        else if (s.equalsIgnoreCase("associate")) {
            return 1;
        }
        else
            return 2;
    }
}
