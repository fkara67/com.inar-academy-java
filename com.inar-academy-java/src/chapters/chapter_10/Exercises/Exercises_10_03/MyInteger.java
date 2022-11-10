package chapters.chapter_10.Exercises.Exercises_10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // The methods isEven(), isOdd(), and isPrime()
    public boolean isEven() {
        return (value % 2 == 0);
    }
    public boolean isOdd() {
        return !isEven(value);
    }
    public boolean isPrime() {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // The static methods isEven(int), isOdd(int), and isPrime(int)
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    public static boolean isOdd(int number) {
        return !isEven(number);
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // The static methods isEven(MyInteger), isOdd(MyInteger), and
    //  isPrime(MyInteger)
    public static boolean isEven(MyInteger myInteger) {
        return isEven(myInteger.value);
    }
    public static boolean isOdd(MyInteger myInteger) {
        return isOdd(myInteger.value);
    }
    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.value);
    }

    public boolean equals(int value) {
        return (this.value == value);
    }
    public boolean equals(MyInteger myInteger) {
        return (myInteger.value == this.value);
    }

    public static int parseInt(char[] arr) {
        return parseInt(new String(arr));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
