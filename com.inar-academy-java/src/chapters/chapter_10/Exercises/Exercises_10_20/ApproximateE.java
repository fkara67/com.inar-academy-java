package chapters.chapter_10.Exercises.Exercises_10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {
    public static void main(String[] args) {
        //BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);

        BigDecimal e = new BigDecimal(1);
        BigDecimal eT = new BigDecimal(1);

        for (int i = 100; i <= 1000; i += 100) {
            for (BigDecimal j = BigDecimal.ONE; j.compareTo(new BigDecimal(i + "")) < 0 ; j = j.add(BigDecimal.ONE)) {
                BigDecimal result = BigDecimal.ONE.divide(j,25, RoundingMode.UP);
                eT = eT.multiply(result);
                eT = eT.divide(BigDecimal.ONE,25, RoundingMode.UP);
                e = e.add(eT);
            }

            System.out.println("The e value for i = " + i + " is " + e);
        }
    }
}
