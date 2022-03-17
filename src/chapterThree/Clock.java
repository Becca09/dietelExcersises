package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour, int minute, int seconds) {

        if (hour > 23)
            hour = 0;
        this.hour = hour;


        if (minute > 59)
            minute = 0;
        this.minute = minute;

        if (seconds > 59)
            seconds = 0;
        this.seconds = seconds;
    }

    public void setHour() {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute() {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds() {
        this.seconds = minute;
    }

    public int getSeconds(){
        return seconds;
    }

    public String getTime(){
        return (" The time says " + hour + ":" + minute + ":" + seconds);
    }
}


