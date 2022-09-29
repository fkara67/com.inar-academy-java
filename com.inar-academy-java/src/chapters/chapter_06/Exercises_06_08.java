package chapters.chapter_06;

public class Exercises_06_08 {

    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        System.out.println("------------------------------------------------------------------");

        for (double celsius = 40, fahrenheit = 120; celsius >= 31 &&
                fahrenheit >= 30; celsius--, fahrenheit -= 10) {
            System.out.printf("%-12.1f%-10.1f", celsius, celsiusToFahrenheit(celsius));
            System.out.print("\t\t|\t\t");
            System.out.printf("%-16.1f%-10.2f", fahrenheit, fahrenheitToCelsius(fahrenheit));
            System.out.println();
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
