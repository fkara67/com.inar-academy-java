package chapters.chapter_06;

public class Exercises_06_27 {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;
        printEmirps(NUMBER_OF_EMIRPS,EMIRPS_PER_LINE);
    }

    public static void printEmirps(int numberOfEmirps, int emirpsPerLine) {
        int count = 0;
        int number = 2;
        while (count < numberOfEmirps) {
            if (isPrime(number)) {
                String s = number + "";
                if (isEmirp(s) && Exercises_06_26.isPalindrome(s) == false) {
                    count++;
                    System.out.printf("%8d", number);
                    if (count % emirpsPerLine == 0) {
                        System.out.println();
                    }
                }
            }
            number++;

        }
    }
    public static boolean isEmirp(String s) {
        String s2 = "";
        boolean isEmirp = false;
        for (int i = s.length() - 1; i >= 0; i--) {
           s2 += s.charAt(i);
        }
        int number2 = Integer.parseInt(s2);
        if (isPrime(number2)) {
            isEmirp = true;
        }
        return isEmirp;
    }
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
}
