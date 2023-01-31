package com.techelevator.workspace;

public class Thing implements ThingInterface {
    //properties
    private String thingName;
    private int numOfMesses;

    public Thing(String thingName){
          this.thingName = thingName;
          this.numOfMesses = numOfMesses;
    }
    //methods
    @Override
    public String getName() {
        return this.thingName;
    }

    @Override
    public void createChaos() {
        System.out.println("Created a big mess...");
        this.numOfMesses += 1;
    }

    @Override
    public void cleanUp() {
        if(this.numOfMesses == 0);{

        }
        this.numOfMesses -= 1;
        System.out.println("Cleaned up their mess!");
    }
    //constructor

}
