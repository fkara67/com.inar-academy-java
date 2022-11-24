package chapters.chapter_12.Exercises.Exercises_12_01;

public class NumberFormatExceptionB {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        if (!isNumeric(args[0])) {
            System.out.println("Wrong input: " + args[0]);
            System.exit(1);
        }
        if (!isNumeric(args[2])) {
            System.out.println("Wrong input: " + args[2]);
            System.exit(1);
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+' : result = n1 + n2; break;
            case '-' : result = n1 - n2; break;
            case '.' : result = n1 * n2; break;
            case '/' : result = n1 / n2;
        }
        // Display result
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
    public static boolean isNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}
