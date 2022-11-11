package chapters.chapter_10.Exercises.Exercises_10_09;

public class TestCourse {
    public static void main(String[] args) {

        Course course = new Course("Math");

        course.addStudent("kara");
        course.addStudent("Sener");
        course.addStudent("karabacak");

        course.dropStudent("kara");

        System.out.println("Students of course are");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents()[i]);
        }
    }
}
