package com.techelevator;

public class RectangleWall extends Wall {
    //properties
    private final int length;
    private final int height;

    //constructor
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    //getters
    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    //methods
    public int getArea() {
        return getHeight() * getLength();
    }

    public String toString() {
        return getName() + " (" + getLength() + "x" + getHeight() + ") " + "rectangle";
    }


}
