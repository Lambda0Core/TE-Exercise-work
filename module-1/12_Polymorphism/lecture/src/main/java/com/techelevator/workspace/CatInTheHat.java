package com.techelevator.workspace;

public class CatInTheHat extends Thing implements ConscienceInterface {

    public CatInTheHat(String thingName) {
        super(thingName);
    }

    @Override
    public void think() {
     String Catthoughts = "I'm horrific when I'm not a cute cartoon!";
    }

    @Override
    public void speak() {
        System.out.println("Hello!");
    }
}
