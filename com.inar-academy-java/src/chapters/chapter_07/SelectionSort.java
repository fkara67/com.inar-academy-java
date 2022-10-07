package chapters.chapter_07;

public class SelectionSort {
    public static void selectionSort(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length;) {
            if (list[i] < min)
                min = list[i];

            int temp = min;
            min = list[i];
            list[i] = min;
            i++;
        }
    }
}
