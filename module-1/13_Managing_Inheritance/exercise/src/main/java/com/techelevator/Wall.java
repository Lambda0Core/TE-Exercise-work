package com.techelevator;

public abstract class Wall {
    //properties
    private final String name;
    private final String color;

    //constructor
    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //getter
    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    public abstract int getArea();


}
