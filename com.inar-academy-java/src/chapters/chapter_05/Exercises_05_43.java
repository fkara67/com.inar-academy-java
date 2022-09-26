package chapters.chapter_05;


public class Exercises_05_43 {
    public static void main(String[] args) {
        String combination = "";
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                combination += "\n" + i + " " + j;
                count++;
            }
        }

        System.out.println(combination + "\nThe total number of all combinations is " + count);
    }


}
