package chapters.chapter_11.Exercises.Exercises_11_13;

import java.util.ArrayList;
import java.util.Scanner;

import static chapters.chapter_11.Exercises.Exercises_11_07.ShuffleArrayList.display;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        display(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer>  distinctIntegers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!distinctIntegers.contains(list.get(i))) {
                distinctIntegers.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(distinctIntegers);
    }
}
