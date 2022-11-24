package chapters.chapter_10.Exercises.Exercises_10_26;

public class Calculator {
    public static void main(String[] args) {
        String[] input = args[0].split("\\s+");

        if (!isValid(input)) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
        }

        int result = 0;
        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                         Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) -
                         Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) *
                         Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                         Integer.parseInt(args[2]);
        }
        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
    public static boolean isValid(String[] input) {
        if (input.length != 3) {
            return false;
        }
        if (input[1].length() != 1) {
            return false;
        }
        if (!isNumeric(input[0]) || !isNumeric(input[2])) {
            return false;
        }
        char op = input[1].charAt(0);
        return op == '+' || op == '-' || op == '*' || op == '/';
    }
    public static boolean isNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}

