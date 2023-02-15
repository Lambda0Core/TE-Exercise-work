package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String animalName = "";
        Map<String, String> animals = new HashMap<String, String>();
        animals.put("rhino", "Crash");
        animals.put("giraffe", "Tower");
        animals.put("elephant", "Herd");
        animals.put("lion", "Pride");
        animals.put("crow", "Murder");
        animals.put("pigeon", "Kit");
        animals.put("flamingo", "Pat");
        animals.put("deer", "Herd");
        animals.put("dog", "Pack");
        animals.put("crocodile", "Float");

        System.out.println(animals.toString());
    }
}
