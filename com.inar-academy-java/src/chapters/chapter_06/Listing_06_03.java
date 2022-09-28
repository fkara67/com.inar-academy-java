package chapters.chapter_06;

public class Listing_06_03 {
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(85.4));
        System.out.println("The grade is " + getGrade(49.9));

    }

    public static String getGrade(double score) {
        if (score >= 90) {
            return "A";
        }
        else if (score >= 80) {
            return "B";
        }
        else if (score >= 70) {
            return "C";
        }
        else if (score >= 60) {
            return  "D";
        }
        else
            return "F";



        }
}
