package chapters.LastPart.Sets;

import java.util.*;

public class abcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }
        System.out.println("number of distinct numbers: " + set.size());
        System.out.println(Arrays.toString(set.toArray()));
    }
}
