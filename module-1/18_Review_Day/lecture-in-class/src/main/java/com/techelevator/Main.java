package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

//        String EmilyChallenge = "";
//
//        Map<Integer, String> intMap = new HashMap<Integer, String>();
//        intMap.put(Integer.parseInt("1"),"one");

        Map<Integer, Blue> blueMap = new HashMap<Integer, Blue>();
        blueMap.put(1, new Blue(18,2.8, "Java Blue"));
        blueMap.put(4, new Blue(16,2.7, "Java Green"));
        blueMap.put(12, new Blue(20,2.9, "Java Purple"));
        blueMap.put(13, new Blue(15,2.5, "Java Yellow"));

        Blue result = blueMap.get(1);

        System.out.println(result.getClassname() + " " + result.getAverageGPA() + " " + result.getStudentCount());

        System.out.println("========================");
        for (Map.Entry<Integer, Blue> item : blueMap.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue().getClassname());

        }

        Set keySet = blueMap.keySet();
        for(Object key : keySet){
            System.out.println(key.toString());
        }

        System.out.println(blueMap.values());

        if (blueMap.containsKey(13)){
            System.out.println("Contains key 13: " + blueMap.get(13).getClassname());
            Blue yellowClass = blueMap.get(13);
            yellowClass.setStudentCount(14);
            yellowClass.setAverageGPA(2.9);

           // blueMap.put(13, yellowClass);
        }

        System.out.println("========================");
        for (Map.Entry<Integer, Blue> item : blueMap.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue().getClassname() + " " + item.getValue().getStudentCount() + " " + item.getValue().getAverageGPA() + " "  ) ;
            System.out.println(String.format("%s: %s %s GPA: %f",
                                                item.getKey(),
                                                item.getValue().getClassname(),
                                                item.getValue().getStudentCount(),
                                                item.getValue().getAverageGPA()));
        }
    }
}
