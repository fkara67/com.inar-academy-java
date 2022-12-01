package chapters.chapter_13.Exercises.Exercises_13_13;

import java.util.Arrays;

public class TestCourseWithClone {
    public static void main(String[] args) {
        CourseWithClone c = new CourseWithClone("Math");
        c.addStudent("haluk");
        c.addStudent("jack");
        c.addStudent("kara");

        CourseWithClone d = c.clone();
        c.addStudent("karabacak");

        String[] studentsC = c.getStudents();
        String[] studentsD = d.getStudents();

        for (int i = 0; i < c.getNumberOfStudents(); i++) {
            System.out.print(studentsC[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < d.getNumberOfStudents(); i++) {
            System.out.print(studentsD[i] + ", ");
        }
    }
}
