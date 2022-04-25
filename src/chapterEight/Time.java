package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        validate(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time (){
        this(0,0,0);
    }

    public Time(int seconds){
        this(0,0,0);
    }

    public Time(int minute, int seconds){
        this(0,0,0);
    }



    public void setTime(int hour, int minute, int seconds) {
        validate(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHourWith(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {

        validateMinuteWith(minute);
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSecondsWith(seconds);
        this.seconds = seconds;
    }



    private static  void  validate(int hour, int minute, int seconds) {
        validateHourWith(hour);
        validateMinuteWith(minute);
        validateSecondsWith(seconds);
    }

    private static void validateSecondsWith(int seconds) {
        boolean secondIsValid = seconds < 0 || seconds >= 24;
        if (secondIsValid) throw new IllegalArgumentException("Invalid seconds");
    }

    private static void validateMinuteWith(int minute) {
        boolean minuteIsValid = minute < 0 || minute >= 24;
        if (minuteIsValid) throw new IllegalArgumentException("Invalid minute");
    }

    private static void validateHourWith(int hour) {
        boolean hourIsValid = hour < 0 || hour >= 24;
        if (hourIsValid) throw new IllegalArgumentException("Invalid hour");
    }





































































































































//    public double calculateTakeHomePay(double basicSalary) {
//        return basicSalary + calculateTransportAllowanceFrom(basicSalary) + calculateFeedingAllowanceFrom(basicSalary) -calculateTaxFrom(basicSalary) ;
//    }
//
//    private double calculateTransportAllowanceFrom(double basicSalary){
//        final double TEN_PERCENT = 0.1;// 10 percent
//        return TEN_PERCENT * basicSalary;
//    }
//
//    private double calculateFeedingAllowanceFrom(double basicSalary){
//        final double THREE_PERCENT = 0.03;// 3 percent
//        return THREE_PERCENT * basicSalary;
//    }
//
//    private double calculateTaxFrom(double basicSalary){
//        final  double TWO_PERCENT = 0.2;
//        return TWO_PERCENT * basicSalary;
//    }

}

