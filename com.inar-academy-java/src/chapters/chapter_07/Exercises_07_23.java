package chapters.chapter_07;

public class Exercises_07_23 {
    public static void main(String[] args) {
        boolean[] isLocked = new boolean[100];
        int numberOfStudents = 100;

        updateDoors(isLocked, numberOfStudents);
        displayOpenDoors(isLocked);


    }
    public static void updateDoors(boolean[] isLocked, int numberOfStudents) {
        for (int student = 1; student <= numberOfStudents; student++) {
            for (int door = student - 1; door < isLocked.length; door += student)
                if (isLocked[door]) {
                    isLocked[door] = false;
                } else {
                    isLocked[door] = true;
                }
        }
    }
    public static void displayOpenDoors(boolean[] isLocked) {
        System.out.println("Open locker numbers are ");
        for (int door = 0; door < isLocked.length; door++) {
            if (isLocked[door]) {
                System.out.print((door + 1) + " ");
            }
        }
    }

}
