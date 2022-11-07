package chapters.chapter_10.Listing;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Database System");

        course1.addStudent("Fatih Jones");
        course1.addStudent("Furkan Sener");
        course1.addStudent("Etka Berk Orman");

        course2.addStudent("Haluk Dundar");
        course2.addStudent("Ismail Aslan");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        System.out.println("The students of the course1 are ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }
}
