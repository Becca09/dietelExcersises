package assignments;

import java.util.Scanner;

public class Television {
    private boolean isOn;
    private int inputChanel;
    private int volume;
    private String input = "TV";
    private boolean isMute;




    public void power() {

        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void setChanel(int value){
        if(isOn) {
            if (value > 0)
                if (value <= 10)
                    inputChanel = value;
            if (value > 10)
                inputChanel = 10;
            if (value < 1)
                inputChanel = 1;
        }
        else System.out.println("invalid");
    }

    public int getInputChanel() {
        return inputChanel;
    }



    public void setVolume( int volume) {
        if(isOn) {
            if (volume >= 0)
                if (volume <= 100)
                    this.volume = volume;
            if (volume > 100)
                this.volume = 100;
            if (volume < 0)
                this.volume = 0;
        }
        else System.out.println("invalid");
    }

    public int getVolume(){
        return volume;
    }

    public void volumeUp() {
        if(isOn) {
            if (volume >= 0)
                if (volume <= 100)
                    volume = volume + 1;
            if (volume > 100)
                volume = 100;
            if (volume < 0)
                volume = 0;
        }
        else System.out.println("invalid");
    }

    public void volumeDown() {
        if(isOn) {
            if (volume >= 0)
                if (volume <= 100)
                    volume = volume - 1;
            if (volume > 100)
                volume = 100;
            if (volume < 0)
                volume = 0;
        }
        else System.out.println("invalid");
    }

    public void chanelUp() {
        if(isOn) {
            if (inputChanel > 0)
                if (inputChanel <= 10)
                    inputChanel = inputChanel + 1;
            if (inputChanel > 10)
                inputChanel = 10;
            if (inputChanel < 1)
                inputChanel = 1;
        }
        else System.out.println("invalid");
    }

    public void chanelDown() {
        if(isOn) {
            if (inputChanel > 0)
                if (inputChanel <= 10)
                    inputChanel = inputChanel - 1;
            if (inputChanel > 10)
                inputChanel = 10;
            if (inputChanel < 1)
                inputChanel = 1;
        }
        else System.out.println("invalid");
    }

    public void switchMode() {
        if(isOn) {
            if (input == "TV")
                input = "AV1";
            else if (input == "AV1")
                input = "AV2";
            else if (input == "AV2")
                input = "TV";
        }
        else System.out.println("invalid");
    }
    public String getSwitchMode(){
        return input;
    }


    public void Mute() {
        isMute = !isMute;
        volume = 0;
    }

    public boolean isMute() {
        return isMute;
    }
}

