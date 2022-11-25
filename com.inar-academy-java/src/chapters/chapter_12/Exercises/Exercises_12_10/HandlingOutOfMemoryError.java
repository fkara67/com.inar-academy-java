package chapters.chapter_12.Exercises.Exercises_12_10;

public class HandlingOutOfMemoryError {
    public static void main(String[] args) {
        try {
            Integer[] arr = new Integer[1000 * 1000 * 1000];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        }
        catch (OutOfMemoryError error) {
            System.out.println("Out of memory error");
        }
        System.out.println("After 'out of memory' error");
    }
}
