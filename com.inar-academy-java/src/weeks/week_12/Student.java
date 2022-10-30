package weeks.week_12;

public class Student {
    private static int studentCounter;
    private String name;
    private String surname;
    private int id;
    private String eMail;
    public final static String ACADEMY = "Inar Academy";

    public String publicAccessModifier;
    String defaultAccessModifier;//package private - default
    private String privateAccessModifier;
    protected String protectedAccessModifier;


    public Student() {
        this("", "", 0, "");
        // this.name = "";
        // this.surname = "";
    }
    public Student(String name, String surname, int id, String eMail) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.eMail = eMail;
        studentCounter++;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getId() {
        return this.id;
    }
    public String getEmail() {
        return this.eMail;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String eMail) {
        this.eMail = eMail;
    }
    public void print() {
        System.out.printf("Name:%s\nSurname:%s\nId:%s\nEmail:%s\n", this.name, this.surname, this.id, this.eMail);
        System.out.println("--------------------");
    }
    public static void printDataFields() {
        System.out.println("Name - Surname - Id - Email");
    }
    public static int getStudentCounter() {
        return studentCounter;
    }
}
