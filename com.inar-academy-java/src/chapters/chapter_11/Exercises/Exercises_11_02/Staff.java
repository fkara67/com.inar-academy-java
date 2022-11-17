package chapters.chapter_11.Exercises.Exercises_11_02;

import chapters.chapter_10.Exercises.Exercises_10_14.MyDate;

public class Staff extends Employee {
    protected String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired,String title) {
        super(name,address,phoneNumber,email,office,salary,dateHired);
        this.title = title;
    }
    public String toString() {
        return "Class: " + getClass() + "\nName: " + getName();
    }

    public String getTitle() {
        return title;
    }
}
