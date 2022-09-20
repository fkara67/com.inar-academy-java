package chapters.chapter_05;

public class Exercises05_03 {
    public static void main(String[] args) {
        final double POUNDS_PER_KİLOGRAM = 2.2;
        double pound = 0;
        System.out.println("Kilograms\t\tPounds");
        for (int kilogram = 1; kilogram < 200; kilogram += 2) {
            pound = kilogram * POUNDS_PER_KİLOGRAM;
            System.out.printf("%-15d\t%6.1f\n", kilogram,pound);
        }
    }
}
