package chapters.LastPart.Lists;

import java.util.ArrayList;
import java.util.List;

public class CountSingleDigits {
    public static void main(String[] args) {
        List<Integer> counts = new ArrayList<>(10);
        for (int i = 0; i < 10 ; i++) {
            counts.add(0);
        }
        for (int i = 0; i < 100; i++) {
            int digit = (int) (Math.random() * 10);
            counts.set(digit, counts.get(digit) + 1);
        }
        for (int i = 0; i < counts.size(); i++) {
            System.out.println("Number of " + i + "s is " + counts.get(i));
        }
    }
}
