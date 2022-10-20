package chapters.chapter_08;

public class Exercises_08_03 {
    /* 1- create a two-dimensional array for answers
       2- create a single-dimensional array for answer key
       3- count each students correct count
       4- display studnets increasing order of the number of correct answers.
     */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} };

        // answer key to the questions
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] correctCounts = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCounts[i]++;
                }
            }
        }
        displayStudentsIncreasingOrder(correctCounts);
    }
    public static void displayStudentsIncreasingOrder(int[] list) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[j] == i) {
                    System.out.println("Student " + (j + 1) + "'s correct count is " + list[j]);
                }
            }
        }
    }
}
