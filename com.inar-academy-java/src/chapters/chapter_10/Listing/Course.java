package chapters.chapter_10.Listing;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    private static final int MAX_STUDENT = 60;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[MAX_STUDENT];
    }
    public void addStudent(String student) {
        if (numberOfStudents >= MAX_STUDENT) {
            throw new RuntimeException("Course Class is Full");
        }
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
