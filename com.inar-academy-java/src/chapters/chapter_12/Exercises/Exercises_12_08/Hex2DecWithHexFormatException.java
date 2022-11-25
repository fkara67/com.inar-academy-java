package chapters.chapter_12.Exercises.Exercises_12_08;

import java.util.Scanner;

public class Hex2DecWithHexFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;

        for (int i = 0, j = hex.length() - 1; i < hex.length(); i++, j--) {
            char hexChar = hex.charAt(i);
            if ((hexChar < 'A' || hexChar > 'F') && (hexChar < '0' || hexChar > '9')) {
                throw new HexFormatException("Wrong Input! A hex number is required.");
            }
            decimalValue += hexCharToDecimal(hexChar) * Math.pow(16,j);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return ch - 'A' + 10;
        }
        // ch is '0', '1', ..., or '9'
        else
            return ch - '0';
    }
}
