package chapters.chapter_12.Exercises.Exercises_12_02;

import java.util. *;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two integers: ");
            try {
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Incorrect input: an integer is required");
                input.nextLine();
            }
        }
    }
}
