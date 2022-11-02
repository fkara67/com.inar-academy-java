package chapters.chapter_09.Exercises.Exercises_09_04;

import java.util.Random;

public class UseRandomClass {
    public static void main(String[] args) {
        Random obj = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.print(obj.nextInt(100) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
