package chapters.LastPart;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lessons = {"turkish","math","physics", "chemical","history", "music"};
        int[] notes = new int[6];

        for (int i = 0; i < lessons.length; i++) {
            System.out.print("Enter " + lessons[i] + " note: ");
            notes[i] = input.nextInt();
        }
        int sum = 0;
        for (int note : notes) {
            sum += note;
        }
        System.out.println("Average of your notes: " + sum / lessons.length);
    }
}
