package chapters.chapter_10.Listing;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < stack.getSize(); i++) {
            System.out.print(stack.peek() + " ");
        }
        System.out.println();
        System.out.println(stack.pop() + " ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());



        System.out.println();

        while (stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
