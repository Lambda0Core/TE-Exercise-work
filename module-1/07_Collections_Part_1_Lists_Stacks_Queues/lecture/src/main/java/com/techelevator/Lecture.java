package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		List<String> names = new ArrayList<>();

		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Legolas");


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
        //[List].size NOT [List].length!!!!!!!
		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		names.add("Sam");

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		names.add(2, "David");

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

        names.remove(2);

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");


//		if (names.contains("Samwise")) {
//			System.out.println("Samwise is in the list ");
//		}else {
//			System.out.println("Samwise not in the list ");
//		}
		String isOrNot = (names.contains("Samwise"))? "" : "not ";
		System.out.println("Samwise is " + isOrNot + "in the list ");

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		System.out.println("Index of Gandalf = " + names.indexOf("Gandalf"));
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		String[] namesArray = names.toArray(new String[0]);
		printLotrArray(namesArray);
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		Collections.sort(names);
        printLotrMembers(names);
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(names);
		printLotrMembers(names);
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		for (String item : names){
			System.out.println(item);
		}
	}

	private static void printLotrArray(String[] namesArray) {
		for (int i = 0; i < namesArray.length; i++) {

			System.out.println(namesArray[i]);
		}
	}

	private static void printLotrMembers(List<String> fellowship){
	for (int i = 0; i < fellowship.size(); i++) {
		System.out.print(fellowship.get(i));
		if (i != fellowship.size() - 1){
			System.out.println(", ");
		}else{
			System.out.println(".");
		}

	}
	System.out.println("");
}

private static void printBrackets(List<String> brackets){
}
}


