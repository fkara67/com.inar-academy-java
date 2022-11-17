package chapters.chapter_11.Exercises.Exercises_11_02;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person() {
        this("","","","");
    }
    public Person(String name, String address, String phoneNumber, String eMailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = eMailAddress;
    }
    @Override
    public String toString() {
        return "Class: " + getClass() + "\nName: " + getName();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
