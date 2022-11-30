package chapters.chapter_13.Exercises.Exercises_13_03;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import static chapters.chapter_13.Exercises.Exercises_13_02.ShuffleArrayList.display;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five number: ");
        ArrayList<Number> list = new ArrayList<>();
        fillArrayList(list);
        System.out.println("Before sort: ");
        display(list);
        sort(list);
        System.out.println("After sort: ");
        display(list);
        System.out.println(list);
    }
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    public static void fillArrayList(ArrayList<Number> list) {
        list.add(90);
        list.add(50.3);
        list.add(new BigInteger("605554556555455544545"));
        list.add(new BigDecimal("70598745654789952355664.5"));
    }
}
