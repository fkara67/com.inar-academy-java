package chapters.chapter_11.Exercises.Exercises_11_05;

import java.util.ArrayList;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Software");

        course.addStudent("kara");
        course.addStudent("Etka");
        course.addStudent("Haluk");
        course.addStudent("Sener");
        course.addStudent("Yasin");
        course.dropStudent("Yasin");
        course.dropStudent("Ahmet");

        ArrayList<String> list = course.getStudents();

        System.out.println(list);
    }
}
