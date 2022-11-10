package chapters.chapter_08;

import java.util.Scanner;

public class Exercises_08_12 {
    /* => ComputeTax
       1- create single-dim arr for rates and two-dim arr for brackets
       2- prompt the user to enter status number
       3- prompt the user to enter taxable income
       4- compute the tax
       5- display the tax
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        System.out.println("Tax is " + computeTax(status,income));
    }
    public static double computeTax(int status, double income) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},  // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or-qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},  // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double tax;

        if (income <= brackets[status][0]) {
            tax = income * rates[0];
            }
        else if (income <= brackets[status][1]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1];
            }
        else if (income <= brackets[status][2]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2];
            }
        else if (income <= brackets[status][3]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3];
            }
        else if (income <= brackets[status][4]) {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4];
            }
        else {
            tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4] +
                    (income - brackets[status][4]) * rates[5];
            }
        return tax;


    }



}




