package chapters.chapter_10.Exercises.Exercises_10_14;

public class TestMyDate {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        MyDate date3 = new MyDate(561555550000L);


        System.out.println("date1: " + date1.getDay() + "." + date1.getMonth() + "." + date1.getYear());
        System.out.println("date2: " + date2.getDay() + "." + date2.getMonth() + "." + date2.getYear());
        System.out.println("date3: " + date3.getDay() + "." + date3.getMonth() + "." + date3.getYear());


    }
}
