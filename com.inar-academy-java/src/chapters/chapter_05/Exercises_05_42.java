package chapters.chapter_05;

import java.util.Scanner;

public class Exercises_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter targeted commission: ");
        final double COMMISSION_SOUGHT = input.nextDouble();

        double sales = 0;
        double commission = 0, commission1 = 0, commission2 = 0, commission3 = 0;
        for (sales = 0.01; commission <= COMMISSION_SOUGHT; sales += 0.01) {

            if (sales >= 0.01 && sales <= 5000)
                commission1 = sales * 8 / 100;
            if (sales >= 5000.01 && sales <= 10000)
                commission2 = (sales - 5000) * 10 / 100;
            if (sales >= 10000.01)
                commission3 = (sales - 10000) * 12 / 100;
            commission = commission1 + commission2 + commission3;
        }
        System.out.printf("Minimum sales amount for your target commission " +
                COMMISSION_SOUGHT + " is %2.2f", sales);
    }
}
