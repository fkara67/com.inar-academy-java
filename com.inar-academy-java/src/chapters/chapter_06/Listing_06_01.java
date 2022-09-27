package chapters.chapter_06;

public class Listing_06_01 {
    public static void main(String[] args) {
        int i = 2;
        int j = 7;
        int k = max(2,7);

        System.out.println("The maximum of " + i + " and " + j + " is " + k);

    }

    private static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        }
        else
            result = num2;

        return result;

    }
}
