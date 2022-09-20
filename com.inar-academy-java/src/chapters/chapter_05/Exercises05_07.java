package chapters.chapter_05;

public class Exercises05_07 {
    public static void main(String[] args) {
        double tuition = 10_000;
        double tuition4 = 0;
        for (int year = 1; year < 15; year++) {
            tuition += tuition * 0.05;

            if (year == 10) {
                System.out.printf("Tuition will be $%.2f in ten years" ,tuition);
            }
            if (year > 10) {
                tuition4 += tuition;
            }

        }
        System.out.printf("\nTotal cost of for years' worth of tuition after tenth year is %.2f", tuition4);
    }
}
