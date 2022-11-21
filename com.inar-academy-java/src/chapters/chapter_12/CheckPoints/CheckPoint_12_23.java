package chapters.chapter_12.CheckPoints;

public class CheckPoint_12_23 {
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            System.out.println(1 / 0);
            System.out.println("statement 3");
        }
        catch (IndexOutOfBoundsException io) {
            System.out.println("io");
        }
        catch (ArithmeticException a) {
            throw a;
        }
        finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
