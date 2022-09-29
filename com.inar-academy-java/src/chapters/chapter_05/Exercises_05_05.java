package chapters.chapter_05;

public class Exercises_05_05 {
    public static void main(String[] args) {
        final double POUND_PER_KILOGRAM = 2.2;
        System.out.println("Kilograms\t  Pounds\t|\tPounds\t\tKilograms");

        for(int kilogram = 1,pound = 20; kilogram < 200 && pound < 516; kilogram += 2, pound += 5) {
            System.out.printf("%-10d%10.1f",kilogram,(kilogram * POUND_PER_KILOGRAM));
            System.out.print("\t|\t");
            System.out.printf("%-10d%11.2f\n", pound,(pound / POUND_PER_KILOGRAM));
        }

    }

}
