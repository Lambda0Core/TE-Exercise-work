package com.techelevator.farm;

public class Tractor implements Singable{
    //properties
    private String name;
    private String sound;



    //constructor
    public Tractor(){
        this.name = "Tractor";
        this.sound = "Vroom!";
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSound() {
        return this.sound;
    }
}
