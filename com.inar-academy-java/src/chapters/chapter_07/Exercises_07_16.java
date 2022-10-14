package chapters.chapter_07;

public class Exercises_07_16 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + (int)(Math.random() * 100000);
        }
        int key = 1 + (int)(Math.random() * 100000);

        long startTime = System.nanoTime();
        System.out.println(linearSearch(numbers,key));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Linear Search Execution Time: " + executionTime);

        selectionSort(numbers);

        startTime = System.nanoTime();
        System.out.println(binarySearch(numbers,key));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Binary Search Execution Time: " + executionTime);
    }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            }
            else if (key == list[mid]) {
                return mid;
            }
            else
                low = mid + 1;
        }
        return - low - 1;

    }
    public static void selectionSort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
