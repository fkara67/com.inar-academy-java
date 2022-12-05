package chapters.LastPart.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowSorting {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row:");
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(input.nextInt());
        }
        display(list);
        sortRows(list);
        display(list);
    }
    private static void display(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    private static void sortRows(List<Integer> list) {
        for (int i = 0; i <= 6; i += 3) {
            for (int j = i; j < i + 2; j++) {
                for (int k = j + 1; k < i + 3; k++) {
                    if (list.get(j) > list.get(k)) {
                        int temp = list.get(j);
                        list.set(j, list.get(k));
                        list.set(k, temp);
                    }
                }
            }
        }
    }
}
