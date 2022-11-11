package chapters.chapter_10.Exercises.Exercises_10_10;

public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 01; i < 20; i++) {
            q.enqueue(i);
        }

        while (q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
