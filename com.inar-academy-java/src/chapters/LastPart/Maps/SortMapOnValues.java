package chapters.LastPart.Maps;

import java.util.*;

public class SortMapOnValues {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, (int)(Math.random() * 10));
        }
        System.out.println("Before sort");
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        sortOnValues(map);
        System.out.println("After sort");
        for (int key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
    public static void sortOnValues(Map<Integer,Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        for (int i = 0; i < values.size() - 1; i++) {
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i) > values.get(j)) {
                    int temp = values.get(i);
                    values.set(i, values.get(j));
                    values.set(j, temp);
                }
            }
        }
        int i = 0;
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            map.put(key, values.get(i));
            i++;
        }
    }
}
