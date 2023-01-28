package com.techelevator;

public class Television {
    boolean isOn=false; //boolean Whether or not the TV is turned on.
    int currentChannel=3; //int The value for the current channel. Channel levels go between 3 and 18.
    int currentVolume=2; //in
    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOff() {
        isOn=false;
    }
    public void turnOn() {
        isOn=true;
        currentChannel=3;
        currentVolume=2;
    }
    public void changeChannel(int newChannel) {
        if(isOn && newChannel>=3 && newChannel<=18)
            currentChannel=newChannel;
    }
    public void channelUp() {
        if(isOn)
        {
            currentChannel+=1;
            if(currentChannel>18)
                currentChannel=3;
        }
    }
    public void channelDown() {
        if(isOn)
        {
            currentChannel-=1;
            if(currentChannel<3)
                currentChannel=18;
        }
    }
    public void raiseVolume() {
        if(isOn)
        {
            if(currentVolume<10)
                currentVolume+=1;
        }
    }
    public void lowerVolume() {
        if(isOn)
        {
            if(currentVolume>0)
                currentVolume-=1;
        }
    }
}

