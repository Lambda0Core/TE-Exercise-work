package com.techelevator;

import java.util.*;

public class Lecture2 {
     public static void main(String[] args){

         //Declare and initialize a map
//         SortedMap<String, String> sortedNameToZip = new HashMap<>();
         Map<String, String> nameToZip = new HashMap<>();

         //Add data

//         sortedNameToZip.put("Emily",  "44017");
//         sortedNameToZip.put("Daniel", "44027");
//         sortedNameToZip.put("Lizzy",  "44541");
         nameToZip.put("Emily",  "44017");
         nameToZip.put("Daniel", "44027");
         nameToZip.put("Lizzy",  "44541");

         System.out.println(nameToZip);

         System.out.println("Emily lives at " + nameToZip.get("Emily"));

         System.out.println("Get all the keys");
         Set<String> keys = nameToZip.keySet();
         Collection<String> values = nameToZip.values();
         System.out.println("Values = " + values);
         for (String value : values){
             System.out.println(value);
         }
         for (String key : keys) {
             System.out.println(key + " lives in " + nameToZip.get(key));

         }

         if (nameToZip == null){
             System.out.println("nameToZip is null");

         }else{
             System.out.println("nameToZip is not null");
         }
         if (nameToZip.containsKey("Emily")){
             System.out.println("Emily found!");
         }
         if (nameToZip.containsValue("44017")){
             System.out.println("44017 exists as a value");
         }
         System.out.println();
         if (!nameToZip.containsKey("Wendee")){
             nameToZip.put("Wendee", "44017");
             System.out.println("Wendee does not exist, creating entry.....Done!");
         }
         System.out.println(nameToZip);
         if (nameToZip.containsKey("Lizzy")){
             System.out.println("Lizzy Smith has moved, updating zip......Done!");
             nameToZip.remove("Lizzy");
             nameToZip.put("Lizzy", "44018");
         }
         System.out.println(nameToZip);
    }
}
