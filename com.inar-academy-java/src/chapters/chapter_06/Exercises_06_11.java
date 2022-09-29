package chapters.chapter_06;

public class Exercises_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");
        System.out.println("--------------------------------");

        for (int salesAmount = 10000; salesAmount <= 100000; i += 5000) {
            System.out.printf("%10s%10.2f", salesAmount,computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount) {

    }
}
