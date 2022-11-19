package weeks.week_15;

public class Calculator {
    public static Number sum(Number number1, Number number2) {
        return new Number((number1.getValue() + number2.getValue()));
    }
    public static Number subtract(Number number1, Number number2) {
        return new Number((number1.getValue() - number2.getValue()));
    }
    public static Number multiply(Number number1, Number number2) {
        return new Number((number1.getValue() * number2.getValue()));
    }
    public static Number divide(Number number1, Number number2) {
        return new Number((number1.getValue() / number2.getValue()));
    }
    public static Number getRemainder(Number number1, Number number2) {
        return new Number((number1.getValue() % number2.getValue()));
    }
    public static void clear(Number number1, Number number2) {
        number1 = null;
        number2 = null;
    }
    public static void clear(Number number) {
        number = null;
    }
    public static Number changeSign(Number n) {
        n.setValue((n.getValue() * -1));
        return n;
    }
}
