package chapters.LastPart.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        Map<Integer, Integer> occurrences = new HashMap<>();
        int number;
        do {
            number = input.nextInt();
            if (number < 100 && number > 0) {
                if (occurrences.containsKey(number)) {
                    int value = occurrences.get(number);
                    occurrences.put(number, value + 1);
                }
                else {
                    occurrences.put(number, 1);
                }
            }
            else {
                System.out.println("Number must be between 0 and 100");
                System.out.print("Enter the integers between 1 and 100: ");
            }
        } while (number != 0);

        print(occurrences);
    }
    public static void print(Map<Integer,Integer> map) {
        Set<Integer> keys = map.keySet();

        for (int key : keys) {
            System.out.println(key + " occurs " + map.get(key) + " time" + ((map.get(key) > 1)? "s":""));
        }
    }
}
