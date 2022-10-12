package chapters.chapter_07;

public class Exercises_07_23 {
    public static void main(String[] args) {
        boolean[] isLocked = new boolean[100];

        for (int student = 1; student <= 100; student++) {
            for (int door = student - 1; door < isLocked.length; door += student)
                if (!isLocked[door]) {
                    isLocked[door] = true;
                } else {
                    isLocked[door] = false;
                }
        }
        System.out.println("Open locker numbers are ");
        for (int door = 0; door < isLocked.length; door++) {
            if (isLocked[door]) {
                System.out.print((door + 1) + " ");
            }
        }
    }
}
