package chapters.chapter_12.Exercises.Exercises_12_07;

import java.util.Scanner;

public class Bin2DecWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + bin + " is " + binToDec(bin.toUpperCase()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int binToDec(String bin) throws NumberFormatException {
        int decimalValue = 0;

        for (int i = 0, j = bin.length() - 1; i < bin.length(); i++, j--) {
            char binChar = bin.charAt(i);
            if (binChar != '0' && binChar != '1') {
                throw new NumberFormatException("Wrong Input! A binary is required.");
            }
            int decChar = binChar - '0';
            decimalValue += decChar * Math.pow(2, j);
        }
        return decimalValue;
    }
}
