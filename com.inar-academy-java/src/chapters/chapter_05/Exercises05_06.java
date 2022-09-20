package chapters.chapter_05;

public class Exercises05_06 {
    public static void main(String[] args) {
        final double KILOMETER_PER_MILE = 1.609;
        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
        for (int mile = 1, kilometer = 20; mile < 11 && kilometer < 66; mile++,kilometer += 5) {
            System.out.printf("%-12d%-10.3f", mile,(mile * KILOMETER_PER_MILE));
            System.out.print("\t|\t");
            System.out.printf("%-16d%-10.3f\n", kilometer,(kilometer / KILOMETER_PER_MILE));
        }
    }
}
