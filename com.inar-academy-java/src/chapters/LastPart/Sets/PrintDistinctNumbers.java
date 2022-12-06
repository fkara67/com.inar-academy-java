package chapters.LastPart.Sets;

import java.util.*;

public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }
        System.out.println("The number of distinct number is " + set.size());
        System.out.println("The distinct numbers are: " + Arrays.toString(set.toArray()));
    }
}
