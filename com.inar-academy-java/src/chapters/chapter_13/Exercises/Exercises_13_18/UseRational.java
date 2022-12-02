package chapters.chapter_13.Exercises.Exercises_13_18;

import chapters.chapter_13.Exercises.Exercises_13_15.RationalWithBigInteger;

import java.math.BigInteger;

public class UseRational {
    public static void main(String[] args) {
        RationalWithBigInteger total = new RationalWithBigInteger();
        for (int i = 1; i <= 99; i++) {
            total = total.add(new RationalWithBigInteger
                    (new BigInteger(i + "") , new BigInteger((i + 1) + "")));
        }

        System.out.println(total);
    }
}
