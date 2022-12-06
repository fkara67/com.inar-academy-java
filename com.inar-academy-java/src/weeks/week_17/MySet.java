package weeks.week_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySet {
    /**
     * 1 - Set can only store Objects
     * 2 - Set can only store unique values
     * 3 - Set does  store the values in a random order
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        addRandomValuesToList(set,5);

        System.out.println(set.size());
        print(set);
    }
    public static void print(Set set) {
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(set.toArray()));
    }
    public static void addRandomValuesToList(Set set, int n) {
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * 10);
            set.add(number);
            System.out.println(number + " Number is added to the set");
        }
    }
}
