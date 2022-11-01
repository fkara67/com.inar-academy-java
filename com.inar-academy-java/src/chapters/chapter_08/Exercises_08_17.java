package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of banks and the limits: ");
        int numberOfBanks = input.nextInt();
        double limit = input.nextDouble();

        double[][] banks = new double[numberOfBanks][];
        for (int i = 0; i < banks.length; i++) {
            banks[i] = getBanksStatesFromUser(i);
        }

        boolean[] unsafeBanks = checkBanks(banks, limit);
        displayUnsafeBanks(unsafeBanks);
    }

    public static boolean[] checkBanks(double[][] banks, double limit) {
        double asset;
        boolean[] unsafeBanks = new boolean[banks.length];

        for (int i = 0; i < banks.length; i++) {
            if (unsafeBanks[i]) {
                continue;
            }
            asset = banks[i][0];

            for (int j = 1; j < banks[i].length; j += 2) {
                if (!unsafeBanks[(int)banks[i][j]]) {
                    asset += banks[i][j + 1];
                }
            }
            if (asset < limit) {
                unsafeBanks[i] = true;
                i = -1;
            }
        }
        return unsafeBanks;
    }
    public static double[] getBanksStatesFromUser(int i) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the borrowers numbers bank " + i + ": ");
        int j = input.nextInt();

        double[] borrowers = new double[j * 2 + 1];
        System.out.print("Enter the balance amount of bank " + i + ": ");

        borrowers[0] = input.nextDouble();

        System.out.print("Enter the banks and their debt's amount to bank " + i + ": ");
        for (int k = 1; k < borrowers.length; k++) {
            borrowers[k] = input.nextDouble();
        }
        return borrowers;
    }
    public static void displayUnsafeBanks(boolean[] unsafeBanks) {
        System.out.print("Unsafe banks are ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            if (unsafeBanks[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
