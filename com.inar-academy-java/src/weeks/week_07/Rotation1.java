package weeks.week_07;

import java.util.Scanner;

public class Rotation1 {
    /**
     * Are the words rotation to one another?
     * InarAcademy --> demyInarAca   (true) AcademyInar, arAcademyIn // InAcademyar
     * Canada      --> daCana        (true)
     * America     --> riAmeca       (false)
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.println(isRotationToOneOther(s1,s2));

    }
    public static boolean isRotationToOneOther(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
