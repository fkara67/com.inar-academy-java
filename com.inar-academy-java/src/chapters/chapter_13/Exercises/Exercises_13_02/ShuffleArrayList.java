package chapters.chapter_13.Exercises.Exercises_13_02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        fillArrayList(list);
        System.out.println("Before shuffle: ");
        display(list);
        shuffle(list);
        System.out.println("After shuffle: ");
        display(list);
    }
    public static void fillArrayList(ArrayList<Number> list) {
        list.add(20);
        list.add(30.3);
        list.add(new BigInteger("805554556555455544545"));
        list.add(new BigDecimal("40598745654789952355664.5"));
    }
    public static void display(ArrayList<Number> list) {
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int)(Math.random() * list.size());

            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex,temp);
        }
    }
}
