package weeks.week_15;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the calculation you want to do:\n(Please take space with operands and operator) ");

        Number number1 = new Number(input.nextDouble());
        String sign = input.next();
        Number number2 = new Number(input.nextDouble());


        Number result = new Number(0);
        // Determine the operator
        switch (sign.charAt(0)) {
            case '+':
                result = Calculator.sum(number1, number2);
                break;
            case '-':
                result = Calculator.subtract(number1,number2);
                break;
            case '.':
                result = Calculator.multiply(number1,number2);
                break;
            case '/':
                result = Calculator.divide(number1,number2);
                break;
            case '%':
                result = Calculator.getRemainder(number1,number2);
        }
        //number1.getValue() + ' ' + sign + ' ' + number2.getValue()
        // Display result
        System.out.printf("%.0f %s %.0f = %.0f",number1.getValue(),sign,number2.getValue(),result.getValue());

    }
}

