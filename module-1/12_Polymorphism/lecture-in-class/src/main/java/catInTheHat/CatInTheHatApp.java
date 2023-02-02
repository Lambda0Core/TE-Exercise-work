package catInTheHat;

import java.util.ArrayList;
import java.util.List;

public class CatInTheHatApp {

    public static void main(String[] args) {
//
//        Thing thing1 = new Thing("Thing 1");
//        Thing thing2 = new Thing("Thing 2");
//
//        thing1.createChaos();
//        thing2.createChaos();
//
//        thing1.cleanup();
//        thing2.cleanup();


        CatInTheHat catInTheHat = new CatInTheHat("Cat-in-the-Hat");
        catInTheHat.speak();
        catInTheHat.speak("It's raining and I'm bored.");
        catInTheHat.think();
        catInTheHat.createChaos();
        catInTheHat.cleanup();

        List<Thing> thingRunAmock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            thingRunAmock.add(new Thing("Thing " + i));
        }

        thingRunAmock.add(catInTheHat);
        for(Thing thing : thingRunAmock){
            thing.createChaos();
        }
//        for(Thing thing : thingRunAmock){
//            thing.cleanup();
//        }

    }



}
