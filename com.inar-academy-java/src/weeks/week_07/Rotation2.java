package weeks.week_07;

import java.util.Scanner;

public class Rotation2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String strNew = input.nextLine();
        System.out.println(reverseWord(str,strNew));

    }
    public static boolean reverseWord(String str, String strNew) {
        boolean isReverse = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if ((strNew == str.substring(j) + str.substring(0, i))) {
                    isReverse = true;
                }
            }
        }
        return isReverse;





    }
}
