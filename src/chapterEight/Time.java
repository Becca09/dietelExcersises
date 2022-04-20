package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour, int minute, int seconds) {
        boolean hourIsValid = hour < 0 || hour >= 24;
        if(hourIsValid) throw new IllegalArgumentException("Invalid hour");
        if (minute < 0 || minute >= 60) throw new IllegalArgumentException("Invalid minute");
        if (seconds < 0 || seconds >= 60) throw new IllegalArgumentException("Invalid seconds");


        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
}
