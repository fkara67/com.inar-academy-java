package chapters.chapter_10.Exercises.Exercises_10_17;

import java.math.BigInteger;

public class SquareNumbers {
    public static void main(String[] args) {
        System.out.println("First ten square numbers that are greater than Long.MAX_VALUE: ");
        findFirstTenSquareNumbersThatAreGreaterThanLongMaxValue();
    }

    public static void findFirstTenSquareNumbersThatAreGreaterThanLongMaxValue() {

        long squareOfMaxLong = (long)Math.sqrt(Long.MAX_VALUE) + 1;
        BigInteger squareNumber = new BigInteger(squareOfMaxLong + "");

        for (int i = 1; i <= 10; i++) {
            System.out.println(squareNumber.multiply(squareNumber));
            squareNumber = squareNumber.add(BigInteger.ONE);
        }
    }
}
