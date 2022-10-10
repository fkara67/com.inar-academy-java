package chapters.chapter_07;

public class Exercises_07_13 {
    public static void main(String[] args) {
    int[] numbers;
    getRandom();
    }
    public static int getRandom(int...numbers) {
        int random = (int)(Math.random() * 53) + 1;
        for (int i = 0; i < numbers.length; i++) {
            random = (int)(Math.random() * 53) + 1;
            numbers[i] = random;
        }
        return random;
    }
}
