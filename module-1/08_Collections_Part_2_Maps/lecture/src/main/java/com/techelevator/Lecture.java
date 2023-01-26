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

		myMap.put(4, "Winter");

		printMap(myMap);

		System.out.println(myMap.get(5));
		System.out.println(myMap.get("Jerry"));
		System.out.println(myMap.get(3).substring(0, 2));
		System.out.println(myMap.remove(3));
		myMap.remove(3);
		printMap(myMap);

		Set<Integer> primeNumbersLessThan10 = new HashSet<>();

		primeNumbersLessThan10.add(2);

		primeNumbersLessThan10.add(3);

		primeNumbersLessThan10.add(5);

		System.out.println(primeNumbersLessThan10.size());

		System.out.println("Does 3 exist? " + primeNumbersLessThan10.contains(3));
		System.out.println(primeNumbersLessThan10);

		for(Integer item : primeNumbersLessThan10){
			System.out.println(item);
		}

		Map<String, String>  vendingMachine = new HashMap<>();


		vendingMachine.put("A1", "Hershey");
		vendingMachine.put("A2", "KitKat");
		vendingMachine.put("A3", "M&Ms");
		vendingMachine.put("A4", "Crunch");
		vendingMachine.put("A5", "Lay's Potato Chips");
		vendingMachine.put("A6", "Ruffles Cheddar Cheese Chips");
		vendingMachine.put("B1", "Coke");
		vendingMachine.put("B1d", "Diet Coke");
		vendingMachine.put("B2", "Pepsi");
		vendingMachine.put("B2d", "Diet Pepsi");
		vendingMachine.put("B3", "Root Beer");
		vendingMachine.put("B4", "Dr. Pepper");
		vendingMachine.put("B4d", "Diet Dr. Pepper");
	}

	private static void printMap(Map<Integer, String> myMap) {
		System.out.println("");
		System.out.println("####################");
		for (Map.Entry<Integer, String> item : myMap.entrySet()){
			System.out.print(item.getKey() + ": ");
			System.out.println(item.getValue());

		}
	}

}
