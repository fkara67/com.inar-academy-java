package chapters.chapter_11.Exercises.Exercises_11_10;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five strings: ");
        MyStack stack = new MyStack();

        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }

        System.out.println("stack size: " + stack.getSize());
        System.out.println("stack size: " + stack.size());
        System.out.println(stack);

        stack.add(3, "Okul"); //bu methodu stack yapisinda kullanmamiz beklenmiyor
                                           // ama miras yoluyla bize ArrayList kaliyor

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nstack size: " + stack.size());
    }
}
