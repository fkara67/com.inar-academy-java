package chapters.chapter_05;

public class Exercises05_04 {
    public static void main(String[] args) {
        final double KILOMETER_PER_MILE = 1.609;
        double kilometer = 0;
        System.out.println("Miles\t\tKilometers");
        for (int mile = 1; mile < 11; mile++) {
            kilometer = mile * 1.609;
            System.out.printf("%-12d%-5.3f\n", mile, kilometer);
        }
    }
}
