package chapters.LastPart.Maps;

import java.util.*;

public class FindMostOccurrences {
    public static void main(String[] args) {
        Map<Integer,Integer> occurrences = new HashMap<>();
        getNumbersFromUser(occurrences);
        displayNumberHasMostOccur(occurrences);
    }
    public static void getNumbersFromUser(Map<Integer, Integer> occurrences) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100(0 ends input): ");
        int number;

        do {
            number = input.nextInt();
            if (occurrences.containsKey(number)) {
                int value = occurrences.get(number);
                occurrences.put(number, value + 1);
            }
            else
                occurrences.put(number, 1);
        }while (number != 0);
    }
    public static void displayNumberHasMostOccur(Map<Integer, Integer> occurrences) {
        Set<Integer> keys = occurrences.keySet();
        Set<Integer> mostOccurKeys = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int key : keys) {
            if (max < occurrences.get(key)) {
                max = occurrences.get(key);
            }
        }
        for (int key : keys) {
            if (occurrences.get(key) == max) {
                mostOccurKeys.add(key);
            }
        }
        System.out.print("The number" +
                ((mostOccurKeys.size() == 1)? " has" : "s have") + " most occurrences: ");
        for (int mostOccurKey : mostOccurKeys) {
            System.out.print(mostOccurKey + " ");
        }
    }
}
