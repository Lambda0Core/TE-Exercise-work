package com.techelevator.review;

public class Car {
    //properties
    private String make;
    private String model;
    private int year;

    //constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    //method
    public String soundHorn(){
        return "Beep!! Beep!!";
    }
    public void startCar(){
        engineSmokes();
        radioVolumeLoud();
        int rattlesPerMile = doorsRattle();
    }

    private int doorsRattle() {
        return 0;
    }

    private void radioVolumeLoud() {
    }

    private void engineSmokes() {
    }
}
