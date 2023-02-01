package com.techelevator;

public class SquareWall extends RectangleWall {

    //properties
    private final int sideLength;

    //constructor
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    //getter
    public int getSideLength() {
        return sideLength;
    }

    //method


    @Override
    public String toString() {
        return getName() +
                " (" + sideLength + "x" +
                sideLength + ") " + "square" ;
    }

    @Override
    public int getArea() {
        return getSideLength() * getSideLength();
    }


}
