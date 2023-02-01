package com.techelevator;

public class TriangleWall extends Wall {

    //properties
    private final int base;
    private final int height;

    //constructor
    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    //getter
    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }


    //methods
    @Override
    public int getArea() {
        return (getBase() * getHeight()) / 2;
    }


    @Override
    public String toString() {
        return getName() + " (" + getBase() + "x" + getHeight() + ") " + "triangle";
    }


}
