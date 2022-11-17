package chapters.chapter_11.Exercises.Exercises_11_02;

import chapters.chapter_10.Exercises.Exercises_10_14.MyDate;

public class TestPersonAndOthers {
    public static void main(String[] args) {
        Person p = new Person("Fatih", "cukur", "0546114", "fkara@gmail");
        Student s = new Student("Furkan","istanbul",
                "0546875","sener@gmail",StatusEnum.FRESHMAN);
        Employee e = new Employee("Etka", "cukur", "0546114", "fkara@gmail",
                "student works",20000,new MyDate());
        Faculty f = new Faculty("Haluk", "cukur", "0546114", "fkara@gmail",
                "student works",20000,new MyDate(),"3","1");
        Staff st = new Staff("Yasin", "cukur", "0546114", "fkara@gmail",
                "student works",20000,new MyDate(),"ayakcı");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
