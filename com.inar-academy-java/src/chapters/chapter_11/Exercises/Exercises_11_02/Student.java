package chapters.chapter_11.Exercises.Exercises_11_02;

public class Student extends Person {
    protected StatusEnum classStatus;

    public Student() {
        this("","","","",StatusEnum.FRESHMAN);
    }
    public Student(String name, String address, String phoneNumber, String email, StatusEnum classStatus) {
        super(name,address,phoneNumber,email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Class: " + getClass() + "\nName: " + getName();
    }

    public StatusEnum getClassStatus() {
        return classStatus;
    }
}
