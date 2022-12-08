package chapters.LastPart.Maps;

import java.util.*;

public class SortMapOnKeys {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            int key = (int)(Math.random() * 20);
            int value = (int)(Math.random() * 20);
            map.put(key,value);
        }
        display(map);
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (Integer key : keys) {
            System.out.print(key + " ");
        }
    }
    public static void display(Map<Integer,Integer> map) {
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("---------------------------");
    }
}
