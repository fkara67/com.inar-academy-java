package chapters.chapter_06;

public class CheckPoint_06_13C {
    public static void main(String[] args) {
        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);

        nPrintln("Welcome to Java!", times);
        System.out.println("After the call,"
                + " variable times is " + times);
    }
    public static void nPrintln(
            String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
}
