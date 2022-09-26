package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, total = 0, count = 0, number = -1;
        float average;
        while (number != 0) {
            System.out.println("Enter an integer: ");
            number = input.nextInt();
            total += number;
            if (number != 0) {
                count++;
            }

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        average = (float) (total / count);
        System.out.println("The number of positives is " + positive + "\nThe number of negatives is " + negative
                + "\nTotal is " + total + "\nAverage is " + average);
    }

}
