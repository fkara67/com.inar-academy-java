package chapters.chapter_09.Exercises.Exercises_09_06;


import chapters.chapter_07.SelectionSort;

public class TestStopwatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        fillArrWithIntegers(arr);
        displaySortingTime(arr);
    }
    public static void fillArrWithIntegers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * Integer.MAX_VALUE);
        }
    }
    public static void displaySortingTime(int[] arr) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        SelectionSort.selectionSort(arr);
        stopwatch.stop();
        System.out.println("The selection sort time of this integers is "
                + stopwatch.getElapsedTime() + " milliseconds");
    }
}
