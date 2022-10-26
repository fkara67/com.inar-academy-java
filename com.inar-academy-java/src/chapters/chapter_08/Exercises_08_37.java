package chapters.chapter_08;

import javax.swing.*;
import java.util.Scanner;

public class Exercises_08_37 {
    /* Guess the capitals
        1- create a two-dim arr for states and their capitals
        2- repeatedly prompt the user to enter a capital for a state
        3- Upon receiving the user input, report whether the answer is correct
        4- display the total correct count
        5- The user’s answer is not case-sensitive.
     */
    public static void main(String[] args) {
        String[][] statesAndCapitals = getStatesAndCapitals();
        int correctCount = askUserRepeatedly(statesAndCapitals);
        System.out.println("The correct count is " + correctCount);
    }
    public static String[][] getStatesAndCapitals() {
        String[][] result = {
                {"Alabama","Montgomery"},{"Alaska","Juneau"},{"Arizona","Phoenix"},
                {"California","Sacramento"},{"Florida","Tallahassee"},{"Georgia","Atlanta"},
                {"Hawaii","Honolulu"},{"Illinois","Springfield"},{"Indiana","Indianapolis"},
                {"Kansas","Topeka"},{"Kentucky","Frankfort"},{"Louisiana","Baton Rouge"},
                {"Massachusetts","Boston"},{"Michigan","Lansing"},{"Minnesota","St. Paul"},
                {"Mississippi","Jackson"},{"Nevada","Carson City"},{"New Jersey","Trenton"},
                {"New Mexico","Santa Fe"},{"New York","Albany"},{"North Carolina","Raleigh"},
                {"Ohio","Columbus"},{"Oklahoma","Oklahoma City"},{"Pennsylvania","Harrisburg"},
                {"Tennessee","Nashville"},{"Texas","Austin"},{"Utah","Salt Lake City"},
                {"Virginia","Richmond"},{"Washington","Olympia"},{"Wisconsin","Madison"} };
        return result;
    }
    public static int askUserRepeatedly(String[][] arr) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("What is the capital of " + arr[i][0] + "?");
            String answer = input.nextLine();
            if (answer.toUpperCase().equals(arr[i][1].toUpperCase())) {
                System.out.println("Your answer is correct");
                correctCount++;
            }
            else {
                System.out.println("The correct answer should be " + arr[i][1]);
            }
        }
        return correctCount;
    }
}
