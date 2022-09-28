package chapters.chapter_06;

import java.util.Scanner;

public class Listing_06_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        
    }

    private static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0, j = hex.length() - 1; i < hex.length() && j >= 0; i++, j--) {
            char hexChar = hex.charAt(i);
            decimalValue += hexCharToDecimal(hexChar) * Math.pow(16,j);
        }
        return decimalValue;

    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        }
        else // ch is '0', '1', ..... '8' or '9'
        return ch - '0';
    }

}
