package chapters.chapter_06;

public class Listing_06_09 {
    public static void main(String[] args) {
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));
        // Invoke the max method with double parameters
        System.out.println("The maximum of 3.4 and 4.5 is " + max(3.4, 4.5));
        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.6, 4.9 and 7.0 is " + max(3.6, 4.9, 7.0));
    }

    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
        //alternatifi
        // return (num1 > num2) ? num1 : num2;

    }
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
