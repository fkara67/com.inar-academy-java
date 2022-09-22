package chapters.chapter_05;



public class Listing05_10 {
    public static void main(String[] args) {
        double tuition = 10_000;
        int year = 0;
        while (tuition < 20_000) {
            tuition *= 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years.");
        System.out.printf("Tuition will be $%.2f in %1d years",tuition,year);
    }
}
