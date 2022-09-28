package chapters.chapter_06;

public class Listing_06_04 {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the invocation x is " + x);
        increment(x);
        System.out.println("After the invocation x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("Inside the method n is " + n);
    }

}
