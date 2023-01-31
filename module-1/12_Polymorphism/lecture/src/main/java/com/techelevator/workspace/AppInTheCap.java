package com.techelevator.workspace;

import java.util.ArrayList;
import java.util.List;

public class AppInTheCap {
    public static void main(String[] args) {
//        Thing thing1 = new Thing("Thing 1");
//        Thing thing2 = new Thing("Thing 2");
//
//        thing1.createChaos();
//        thing2.createChaos();
//        thing1.cleanUp();
//        thing2.cleanUp();

        CatInTheHat catInTheHat = new CatInTheHat("Cat-in-the-Hat");
        catInTheHat.speak();
        catInTheHat.think();
        catInTheHat.createChaos();
        catInTheHat.cleanUp();

        List<Thing> thingRunAmock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            thingRunAmock.add(new Thing("Thing " + i));

        }
        thingRunAmock.add(catInTheHat);
        for(Thing thing : thingRunAmock){
            thing.createChaos();
        }
        for(Thing thing : thingRunAmock){
            thing.cleanUp();
        }

    }
}
