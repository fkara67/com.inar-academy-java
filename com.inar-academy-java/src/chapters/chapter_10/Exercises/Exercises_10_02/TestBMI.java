package chapters.chapter_10.Exercises.Exercises_10_02;


public class TestBMI {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Fatih Kara", 27, 145, 0, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());
    }
}
