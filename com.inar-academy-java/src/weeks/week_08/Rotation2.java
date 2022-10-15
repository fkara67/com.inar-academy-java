package weeks.week_08;

import java.util.Scanner;

public class Rotation2 {
    /**
     * Are the words rotation to one another?
     * InarAcademy --> demyInarAca   (true) AcademyInar, arAcademyIn // InAcademyar
     * Canada      --> daCana        (true)
     * America     --> riAmeca       (false)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();
        boolean result = isRotationToOneOther(s1,s2,false);
        System.out.println(result);

    }
    public static boolean isRotationToOneOther(String s1, String s2, boolean isRotation) {
        if (s1.length() != s2.length()) {
            return false;
        }


        //InarAcademy --> demyInarAca true
        for (int i = 0; i < s1.length(); i++) {
            //TODO implementation
            if (s2.equals(rotation(s1,i))) {
                return true;
            }

        }
        return false;
    }
    public static String rotation(String s1, int i) {
        String s3 = ""; //InarAcademy
        for (int j = i; j < s1.length(); j++) {
            s3 += s1.charAt(j); // demy
        }
        for (int j = 0; j < i; j++) {
            s3 += s1.charAt(j); //demyInarAca
        }
        return s3;
    }
}
