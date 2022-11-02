package chapters.chapter_09.Exercises.Exercises_09_06;

import java.util.Date;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
