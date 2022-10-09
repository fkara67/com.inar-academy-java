package chapters.chapter_07;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        displayArray(list);

        double[] list2 = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        selectionSort(list2);
        System.out.println();
        displayArray(list2);
    }
    public static void selectionSort(double[] list) {
        
        for (int i = 0; i < list.length; i++) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    double temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
    public static void displayArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
