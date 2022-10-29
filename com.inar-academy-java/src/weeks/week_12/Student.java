package weeks.week_12;

public class Student {
    String name;
    String surname;
    int id;
    String eMail;

    public Student() {
        this.name = "";
        this.surname = "";
    }
    public Student(String name1, String surname1, int id1, String eMail1) {
        name = name1;
        surname = surname1;
        id = id1;
        eMail = eMail1;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }
    public String geteMail() {
        return eMail;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setSurname(String newSurname) {
        surname = newSurname;
    }
    public void setId(int newId) {
        id = newId;
    }
    public void seteMail(String newEmail) {
        eMail = newEmail;
    }
}
