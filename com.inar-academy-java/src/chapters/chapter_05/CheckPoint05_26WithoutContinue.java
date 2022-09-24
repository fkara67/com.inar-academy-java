package chapters.chapter_05;

public class CheckPoint05_26WithoutContinue {
    public static void main(String[] args) {
        int number = 0, sum = 0;

        while (number < 20) {
            number++;
            if (number != 10 && number != 11) {
                sum += number;

            }

        }

        System.out.println("The sum is " + sum);
    }
}
