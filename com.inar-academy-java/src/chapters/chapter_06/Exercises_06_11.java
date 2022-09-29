package chapters.chapter_06;

public class Exercises_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");
        System.out.println("--------------------------------");

        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("%-18s%10.2f", salesAmount,computeCommission(salesAmount));
            System.out.println();
        }
    }
    public static double computeCommission(double salesAmount) {
        double commission1 = 0, commission2 = 0, commission3 = 0;
        if (salesAmount >= 0.01 && salesAmount <= 5000)
            commission1 = salesAmount * 8 / 100;
        if (salesAmount >= 5000.01 && salesAmount <= 10000) {
            commission1 = 5000 * 8 / 100;
            commission2 = (salesAmount - 5000) * 10 / 100;
        }
        if (salesAmount >= 10000.01) {
            commission1 = 5000 * 8 / 100;
            commission2 = 5000 * 10 / 100;
            commission3 = (salesAmount - 10000) * 12 / 100;
        }
        double commission = commission1 + commission2 + commission3;

        return commission;



    }
}
