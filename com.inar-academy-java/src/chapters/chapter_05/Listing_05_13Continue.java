package chapters.chapter_05;

public class Listing_05_13Continue {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;

        while (number < 20) {
            number++;

            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
