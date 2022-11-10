package chapters.chapter_10.Exercises.Exercises_10_03;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger number = new MyInteger(1249);
        System.out.println("number.isEven()? (1249) " + number.isEven());
        System.out.println("number.isOdd()? (1249) " + number.isOdd());
        System.out.println("number.isPrime()? (1249) " + number.isPrime());

        System.out.println("MyInteger.isEven(2458)? " + MyInteger.isEven(2458));
        System.out.println("MyInteger.isOdd(2458)? " + MyInteger.isOdd(2458));
        System.out.println("MyInteger.isPrime(2458)? " + MyInteger.isPrime(2458));

        MyInteger number1 = new MyInteger(2651);
        System.out.println("MyInteger.isEven(number1)? (2651) " + MyInteger.isEven(number1));
        System.out.println("MyInteger.isOdd(number1)? (2651) " + MyInteger.isOdd(number1));
        System.out.println("MyInteger.isPrime(number1)? (2651) " + MyInteger.isPrime(number1));

        MyInteger number2 = new MyInteger(67);
        System.out.println("(67) number2.equals(67)? " + number2.equals(67));

        MyInteger number3 = new MyInteger(67);
        System.out.println("(67) number2.equals(number3)? (67) " + number2.equals(number3));
        System.out.println("(2651) number1.equals(number3)? (67) " + number1.equals(number3));

        System.out.println("parseInt(\"1667\") : " + MyInteger.parseInt("1667"));

        System.out.println("parseInt(char[]{3, 5, 7}) : " + MyInteger.parseInt(new char[]{'3', '5', '7'}));

    }
}
