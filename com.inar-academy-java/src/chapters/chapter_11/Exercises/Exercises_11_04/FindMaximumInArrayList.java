package chapters.chapter_11.Exercises.Exercises_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        fillArrayListWithInput(list);

        System.out.println("The max number in the list is: " + max(list));
    }

    private static void fillArrayListWithInput(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int number;

        do {
            number = input.nextInt();
            if (number != 0) {
                list.add(number);
            }
        }while (number != 0);
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
