package chapters.chapter_12.Exercises.Exercises_12_09;

import java.util.Scanner;

public class Bin2DecWithBinaryFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + bin + " is " + binToDec(bin.toUpperCase()));
        }
        catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int binToDec(String bin) throws BinaryFormatException {
        int decimalValue = 0;

        for (int i = 0, j = bin.length() - 1; i < bin.length(); i++, j--) {
            char binChar = bin.charAt(i);
            if (binChar != '0' && binChar != '1') {
                throw new BinaryFormatException("Wrong Input! A binary is required.");
            }
            int decChar = binChar - '0';
            decimalValue += decChar * Math.pow(2, j);
        }
        return decimalValue;
    }
}
