package chapters.chapter_10.Exercises.Exercises_10_01;

public class TestTime {
    /* 1- create two Time objects (using new Time() and new
         Time(555550000))
       2- displays their hour, minute, and second in the format hour:minute:second.
    */
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println("time1 is " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("time2 is " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    }
}
