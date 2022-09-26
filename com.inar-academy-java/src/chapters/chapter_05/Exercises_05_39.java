package chapters.chapter_05;

public class Exercises_05_39 {
    public static void main(String[] args) {
        double commission = 0;
        double commission1 = 0, commission2 = 0, commission3 = 0;
        double sales = 0.01;
        do {
            if (sales >= 0.01 && sales <= 5000)
                commission1 = sales * 8 / 100;
            if (sales >= 5000.01 && sales <= 10000)
                commission2 = (sales - 5000) * 10 / 100;
            if (sales >= 10000.01)
                commission3 = (sales - 10000) * 12 / 100;
            commission = commission1 + commission2 + commission3;
            sales += 0.01;
            }while (commission <= 25000);
        System.out.printf("The minimum sales amount for income of $30000 is %2.2f", sales);
    }
}
