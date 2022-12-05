package chapters.LastPart.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseAList {
    public static void main(String[] args) {
        List<Integer> list = getNumbersFromUser();
        System.out.println("Before reverse");
        display(list);
        reverse(list);
        System.out.println("After reverse");
        display(list);
    }
    public static List<Integer> getNumbersFromUser() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
    public static void display(List<Integer> list) {
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void reverse(List<Integer> list) {
        for (int begin = 0, end = list.size() - 1; begin < end; begin++, end--) {
            int temp = list.get(begin);
            list.set(begin, list.get(end));
            list.set(end, temp);
        }
    }
}
