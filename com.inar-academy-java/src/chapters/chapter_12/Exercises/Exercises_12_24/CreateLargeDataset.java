package chapters.chapter_12.Exercises.Exercises_12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateLargeDataset {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");

        if (file.exists()) {
            System.out.println("The file is already exists!");
        }
        String[] ranks = {"assistant", "associate","full"};
        int rank = -1;

        try(
                PrintWriter output = new PrintWriter(file);
                ){
            for (int i = 1; i <= 1000; i++) {
                rank = (int) (Math.random() * ranks.length);
                double salary = getSalary(rank);
                output.printf("FirstName%d LastName%d %s %.2f\n",i,i,ranks[rank],salary);
            }
        }
    }
    public static double getSalary(int rank) {
        if (rank == 0) {
            return Math.random() * 30000 + 50000;
        }
        else if (rank == 1) {
            return Math.random() * 50000 + 60000;
        }
        else
            return Math.random() * 55000 + 75000;
    }
}
