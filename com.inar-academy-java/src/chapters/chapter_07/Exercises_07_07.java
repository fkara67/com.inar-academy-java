package chapters.chapter_07;

public class Exercises_07_07 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int[] counts = new int[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (int)(Math.random() * 10);
            counts[numbers[i]]++;
        }
        displayArray(numbers);
        displayCounts(counts);
    }
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s : " + counts[i]);

        }
    }
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }
}
