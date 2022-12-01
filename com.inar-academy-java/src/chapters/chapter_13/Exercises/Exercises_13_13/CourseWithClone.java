package chapters.chapter_13.Exercises.Exercises_13_13;

public class CourseWithClone implements Cloneable {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    private static final int MAX_STUDENT = 60;

    public CourseWithClone(String courseName) {
        this.courseName = courseName;
        students = new String[MAX_STUDENT];
    }
    @Override
    public CourseWithClone clone() {
        try {
            CourseWithClone clone = (CourseWithClone) super.clone();
            clone.students = students.clone();
            return clone;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
    public void addStudent(String student) {
        if (numberOfStudents >= MAX_STUDENT) {
            throw new RuntimeException("Course Class is Full");
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
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
