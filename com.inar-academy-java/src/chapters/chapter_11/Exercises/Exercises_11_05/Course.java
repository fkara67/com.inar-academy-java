package chapters.chapter_11.Exercises.Exercises_11_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    private static final int MAX_STUDENT = 60;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }
    public void addStudent(String student) {
        if (students.size() >= MAX_STUDENT) {
            throw new RuntimeException("Course Class is Full");
        }
        students.add(students.size(),student);
    }
    public void dropStudent(String student) {
        if (!students.contains(student))
            System.out.println("There is not student named " + student);
        students.remove(student);
    }
    public ArrayList<String> getStudents() {
        return students;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getNumberOfStudents() {
        return students.size();
    }
}
