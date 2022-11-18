package chapters.chapter_11.Exercises.Exercises_11_07;

import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillArrayList(list);
        display(list);
        shuffle(list);
        display(list);
    }
    public static void fillArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i, i);
        }
    }
    public static void display(ArrayList<Integer> list) {
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }
    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int)(Math.random() * list.size());

            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex,temp);
        }


    }
}
