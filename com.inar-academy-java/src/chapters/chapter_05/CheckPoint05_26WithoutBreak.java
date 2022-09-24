package chapters.chapter_05;

public class CheckPoint05_26WithoutBreak {
    public static void main(String[] args) {
        int number = 0 , sum = 0;

        while (number < 20 && sum < 100) {
            number++;
            sum += number;

        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
