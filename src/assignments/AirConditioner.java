package assignments;

public class AirConditioner {
    private boolean isOn;
    private int temperatureLevel;

    public void power() {

        isOn = !isOn;
    }

    public boolean isOn() {
       return isOn;
    }

    public int getTemperatureLevel() {

        return temperatureLevel;

    }

    public void increaseTemperature(int value) {
    if(isOn) {
    if (value >= 16)
        if (value <= 30) {
            temperatureLevel = value + 1;
        }
    if (value > 30)
        temperatureLevel = 30;
    }
    else System.out.println("Invalid");
    }

    public void decreaseTemperature(int value) {
        if(isOn) {
            if (value >= 16)
                if (value <= 30) {
                    temperatureLevel = value - 1;
                }
            if (value < 16)
                temperatureLevel = 16;
        }
        else System.out.println("Invalid");

    }

}


