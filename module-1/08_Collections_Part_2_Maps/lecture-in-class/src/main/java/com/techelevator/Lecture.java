package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

    public static void main(String[] args) {

        System.out.println("####################");
        System.out.println("        MAPS");
        System.out.println("####################");
        System.out.println();

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Rick");
        myMap.put(2, "Beth");
        myMap.put(3, "Jerry");
        myMap.put(4, "Summer");


		printMap(myMap);

		myMap.put(4,"Winter");
		printMap(myMap);

		System.out.println( myMap.get(3));
		System.out.println( myMap.get(5));
		System.out.println( myMap.get("Jerry"));


		System.out.println(myMap.get(3).substring(0,2));
		//this is an error
		//System.out.println(myMap.get(5).substring(0,2));


		System.out.println(myMap.remove(3));
		printMap(myMap);

		System.out.println();
		System.out.println("============================");
		System.out.println(" Sets");
		System.out.println("==========================");

		Set<Integer> primeNumbersLessThan10 = new HashSet<>();
		primeNumbersLessThan10.add(2);
		primeNumbersLessThan10.add(3);
		primeNumbersLessThan10.add(5);
		primeNumbersLessThan10.add(15);
		System.out.println(primeNumbersLessThan10.size());
		System.out.println("Does 3 exists? " + primeNumbersLessThan10.contains(3));

		primeNumbersLessThan10.remove(15);

		for(Integer item : primeNumbersLessThan10 ){
			System.out.println(item);
		}
	}

	private static void printMap(Map<Integer, String> myMap) {
		System.out.println();
		System.out.println("===================");
		for (Map.Entry<Integer, String> item : myMap.entrySet()){
			System.out.print(item.getKey() + ": ");
			System.out.println(item.getValue());
		}
	}

}
