package chapters.chapter_11.Exercises.Exercises_11_02;

import chapters.chapter_10.Exercises.Exercises_10_14.MyDate;

public class Faculty extends Employee {
    protected String officeHours;
    protected String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired,String officeHours, String rank) {
        super(name,address,phoneNumber,email,office,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String toString() {
        return "Class: " + getClass() + "\nName: " + getName();
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }
}
