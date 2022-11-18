package chapters.chapter_11.Exercises.Exercises_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five number: ");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        System.out.println(list);
        System.out.println("Sum of the numbers in the list: " + sum(list));
    }
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
