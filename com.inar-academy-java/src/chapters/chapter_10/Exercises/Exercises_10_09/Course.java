package chapters.chapter_10.Exercises.Exercises_10_09;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    private static final int DEFAULT_CAPACITY = 16;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[DEFAULT_CAPACITY];
    }
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students,0,temp,0,student.length());
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
            else
                System.out.println("There is not student " + student);
        }
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }
    public void clear() {
        students = new String[DEFAULT_CAPACITY];
        numberOfStudents = 0;
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
