package com.techelevator;

import java.util.*;

public class Lecture2 {

    public static void main(String[] args) {


        System.out.println("==============================");
        System.out.println("  Maps");
        System.out.println("===============================");


        //declare and initialize a map
        Map<String, String> nameToZip = new HashMap<>();

        //add data
        nameToZip.put("David", "44128");
        nameToZip.put("Dan", "44124");
        nameToZip.put("Elizabeth", "44012");

        //retrieve data -> get
        System.out.println("David lives in " + nameToZip.get("David"));
        System.out.println("Dan lives in " + nameToZip.get("Dan"));
        System.out.println("Elizabeth lives in " + nameToZip.get("Elizabeth"));
        System.out.println();

        //retrieve keys
        System.out.println("get all the keys from the Map");

        //equivalent statements
        String[] newKeys = {"David", "Dan", "Elizabeth"};
        Set<String> keys = nameToZip.keySet();
        Collection<String> values = nameToZip.values();
        //print values
        for (String value : values){
            System.out.println(value);
        }
        for (String value : nameToZip.values())
        {
            System.out.println(value);
        }


        System.out.println();

        //does a key exist
        if (nameToZip.containsKey("David")){
            System.out.println("David is a key");
        }

        if (nameToZip.containsValue("44124")){
            System.out.println("44124 exists as a value");
        }
        System.out.println();

        if (!nameToZip.containsKey("Doug")){
            nameToZip.put("Doug", "45002");
            System.out.println("Doug did not exist and was added");
        }

        for(String key : keys){
            System.out.println(key + " lives in " + nameToZip.get(key));
        }

        System.out.println("====================");
        //update a key
        nameToZip.put("Doug", "90215");
        for(String key : keys){
            System.out.println(key + " lives in " + nameToZip.get(key));
        }

        System.out.println("====================");
        //delete a key
        System.out.println(nameToZip.remove("Doug") + " <- string return for remove Doug");
        if (!nameToZip.remove("Doug", "90215")) {
            System.out.println("Doug is not here");
        }

        for(String key : keys){
            System.out.println(key + " lives in " + nameToZip.get(key));
        }
    }
}
