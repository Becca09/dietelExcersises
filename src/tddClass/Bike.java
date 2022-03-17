package tddClass;

public class Bike{
    private boolean isOn;
    private int incrementLevel;
    private int decrementLevel;
    private String gear;

    public void start(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getIncrementLevel() {
        return incrementLevel;
    }



    public void increaseAccelerationOne(){
    if(isOn) {
    incrementLevel = incrementLevel + 1;
    }
    else System.out.println("invalid");
    }

    public void increaseAccelerationTwo(){
        if(isOn){
            incrementLevel = incrementLevel+ 2;
        }

        else System.out.println("invalid");

    }

    public void increaseAccelerationThree(){
        if(isOn) {
            incrementLevel = incrementLevel + 3;

        }
        else System.out.println("invalid");

    }

    public void increaseAccelerationFour(){
        if(isOn) {
            incrementLevel = incrementLevel + 4;
        }
        else System.out.println("invalid");

    }


    public int getDecrementLevel() {
        return decrementLevel;
    }

    public void reduceAccelerationOne() {
        if (isOn) {

            decrementLevel = incrementLevel - 1;
        }
        else System.out.println("invalid");

    }



    public void reduceAccelerationTwo(){
        if(isOn) {
            decrementLevel = incrementLevel - 2;
        }
        else System.out.println("invalid");

    }

    public void reduceAccelerationThree(){
        if(isOn) {
            decrementLevel = incrementLevel - 3;
        }
        else System.out.println("invalid");

    }

    public void reduceAccelerationFour(){
        decrementLevel = incrementLevel - 4;
    }

    public String getGear(){
        return gear;
    }

    public void gearTest(int value) {
        if (isOn) {
            if (value >= 0 && value <= 20) {
                gear = "Gear1";
            }
            if (value >= 21 && value <= 30) {
                gear = "Gear2";
            }
            if (value >= 31 && value <= 40) {
                gear = "Gear3";
            }
            if (value >= 40) {
                gear = "Gear4";
            }
        }
        else System.out.println("invalid");

    }
}

