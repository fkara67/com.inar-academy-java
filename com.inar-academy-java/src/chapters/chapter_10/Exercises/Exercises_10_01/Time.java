package chapters.chapter_10.Exercises.Exercises_10_01;

public class Time {
    //The data fields hour, minute, and second that represent a time.
    private long hour;
    private long minute;
    private long second;

    //A no-arg constructor that creates a Time object for the current time.
    public Time() {
        this(System.currentTimeMillis());
    }

    /* constructs a Time object with a specified elapsed time
        since midnight, January 1, 1970, in milliseconds.
     */
    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    /* constructs a Time object with the specified hour, minute, and second.
     */
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;

        // Compute the current second in the minute in the hour
        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        // Compute the current hour
        hour = totalHours % 24;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
}
