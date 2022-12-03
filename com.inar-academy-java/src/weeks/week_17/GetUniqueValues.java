package weeks.week_17;

import java.util.*;

public class GetUniqueValues {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addRandomValuesToList(list,20);
        print(list);
        System.out.println(Arrays.toString(list.toArray()));
        printUniqueValuesOnly(list);
    }
    private static void addRandomValuesToList(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 10));
        }
    }
    private static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void printUniqueValuesOnly(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println("Unique values in the list: " + Arrays.toString(set.toArray()));
        System.out.println("There are " + (list.size() - set.size()) + " duplicate values");
    }
}
