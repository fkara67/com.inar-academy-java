package chapters.chapter_06;

public class Exercises_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");
        System.out.println("---------------------------------------------------");

        for (double feet = 1.0, meter = 20.0; feet <= 10 && meter <= 65; feet++, meter += 5) {
            System.out.printf("%4s%13.3f", feet, footToMeter(feet));
            System.out.print("\t\t|\t\t");
            System.out.printf("%1s%13.3f", meter, meterToFoot(meter));
            System.out.println();
        }
    }
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }

}
