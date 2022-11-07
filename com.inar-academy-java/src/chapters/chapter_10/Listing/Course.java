package chapters.chapter_10.Listing;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student) {
        // Left as an exercise in Programming Exercise 10.9
    }
    public String[] getStudents() {
        return students;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
