package chapters.chapter_11.Exercises.Exercises_11_02;

import chapters.chapter_10.Exercises.Exercises_10_14.MyDate;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;


    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    public String toString() {
     return "Class: " + getClass() + "\nName: " + getName();
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }
}
