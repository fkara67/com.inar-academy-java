package chapters.chapter_07;

public class Exercises_07_16 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }
        int key = (int)(Math.random() * 100000);

        long startTime = System.nanoTime();
        System.out.println(linearSearch(numbers,key));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Linear Search Execution Time: " + executionTime);

        SelectionSort.selectionSort(numbers);

        long startTime2 = System.nanoTime();
        System.out.println(BinarySearch.binarySearch(numbers,key));
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("Binary Search Execution Time: " + executionTime2);
    }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }
}
