package chapters.chapter_11.Exercises.Exercises_11_14;

import java.util.ArrayList;
import java.util.Scanner;

import static chapters.chapter_11.Exercises.Exercises_11_07.ShuffleArrayList.display;

public class CombineTwoLists {
    public static void main(String[] args) {
        System.out.print("Enter five integers for list1: ");
        ArrayList<Integer> list1 = fillWithInput(5);
        System.out.print("Enter five integers for list2: ");
        ArrayList<Integer> list2 = fillWithInput(5);

        ArrayList<Integer> unionOfTwoLists = union(list1,list2);
        System.out.print("The combined list is: ");
        display(unionOfTwoLists);

    }
    public static ArrayList<Integer> fillWithInput(int size) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionOfTwoIntegers = new ArrayList<>();
        unionOfTwoIntegers.addAll(list1);
        unionOfTwoIntegers.addAll(list2);
        return unionOfTwoIntegers;
    }
}
