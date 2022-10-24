package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_21 {
    /*  FindCentralCity
        1- prompt the user to enter number of cities
        2- prompt the user to enter locations of cities(coordinates)
        3- find central city and its total distance to all other cities
        4- display the result
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double[][] cities = new double[numberOfCities][2];
        fillArr(cities,input);
        findCentralCity(cities);
    }
    public static void fillArr(double[][] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = input.nextDouble();
            arr[i][1] = input.nextDouble();
        }
    }
    public static void findCentralCity(double[][] cities) {
        double min = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < cities.length; i++) {
            double totalDistance = 0;
            for (int j = 0; j < cities.length; j++) {
                if (i != j) {
                    double distance = Math.sqrt(Math.pow(cities[j][0]- cities[i][0], 2) + Math.pow(cities[j][1] - cities[i][1], 2));
                    totalDistance += distance;
                }
            }
            if (min > totalDistance) {
                min = totalDistance;
                minIndex = i;
            }
        }
        System.out.println("The central city is at (" + cities[minIndex][0] + "," + cities[minIndex][1] + ")");
        System.out.printf("The total distance to all other cities is %2.2f", min);
    }
}
