package chapters.chapter_05;

public class Exercises05_26 {
    public static void main(String[] args) {

        double e = 1;
        double eT = 1;

        for (int i = 10000; i <= 100000; i += 10000) {
            for (int j = 1; j <= i; j++) {
                eT *= (double)1/j;
                e += (double)eT;
            }
            System.out.println("The e value for i = " + i + " is " + e);
        }
        System.out.println("The e value for java Math.E method is " + Math.E);

    }
}
