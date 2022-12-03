package weeks.week_17;

import java.util.ArrayList;
import java.util.List;

public class GetMinInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addRandomValuesToList(list,10);
        print(list);
        System.out.println("Minimum value in the list: " + getMin(list));
        System.out.println("The index of min value in the list: " + getMinIndex(list));
    }
    private static void addRandomValuesToList(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 100));
        }
    }
    private static int getMin(List list) {
        int min = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > (int) list.get(i)) {
                min = (int) list.get(i);
            }
        }
        return min;
    }
    private static void print(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    private static int getMinIndex(List list) {
        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if ((int) list.get(minIndex) > (int) list.get(i)) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
