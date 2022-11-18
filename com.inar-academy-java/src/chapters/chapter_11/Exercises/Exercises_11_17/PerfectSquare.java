package chapters.chapter_11.Exercises.Exercises_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        ArrayList<Integer> factors = findTheFactors(m);
        ArrayList<Integer> factorsOfN = findTheFactorsOfN(factors, m);
        displayResult(factorsOfN,m);
    }
    public static ArrayList<Integer> findTheFactors(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (divisor <= m) {
            while (m % divisor == 0) {
                m /= divisor;
                factors.add(divisor);
            }
            divisor++;
        }
        return factors;
    }
    public static ArrayList<Integer> findTheFactorsOfN(ArrayList<Integer> f, int m) {
        ArrayList<Integer> factorsOfN = new ArrayList<>();
        for (int i = 2; i <= m; i++) {
            int count = 0;
            for (int j = 0; j < f.size(); j++) {
                if (f.get(j) == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                factorsOfN.add(i);
            }
        }
        return factorsOfN;
    }
    public static void displayResult(ArrayList<Integer> f, int m) {
        int n = 1;
        for (int i = 0; i < f.size(); i++) {
            n *= f.get(i);
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + n +
                "\nm * n is " + m * n);

    }
}
