package com.techelevator;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<String>();

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

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2,"David");

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);

		printLotrMembers(names);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean isInList = names.contains("Samwise");
		System.out.println("Samwise is in the list of names? " + isInList);

		checkForSamwise(names);

		String isIsNot = (names.contains("Samwise"))? "" : "not ";
		System.out.println("Samwise is " + isIsNot + "in the list");
		System.out.println();

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfGandalf = names.indexOf("Gandalf");
		System.out.println("Gandalf is at index " + indexOfGandalf);

		System.out.println("Gandalf is at index " + names.indexOf("Gandalf"));

		System.out.println();

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray(new String[0]);

		printLotrArray(namesArray);


		System.out.println("==========================");
		System.out.println("Sort and reverse in the same line");
		System.out.println("==========================");
		Collections.sort(names);
		Collections.reverse(names);
		printLotrMembers(names);


		Collections.sort(names, Collections.reverseOrder());

		printLotrMembers(names);

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
		System.out.println("       FOREACH " );
		System.out.println("####################");
		System.out.println();

		for (String item : names){
			System.out.println(item  );
		}
	}

	private static void checkForSamwise(List<String> names) {
		if (names.contains("Samwise")) {
			System.out.println("Samwise is  in the list");
		} else {
			System.out.println("Samwise is not in the list");
		}
	}

	private static void printLotrArray(String[] namesArray) {
		for (int i = 0; i < namesArray.length; i++) {
			System.out.println(namesArray[i]);
		}
	}

	private static void printLotrMembers(List<String> fellowship){
		for (int i = 0; i < fellowship.size(); i++) {
//			System.out.print(fellowship.get(i) );
//
//			if (i != fellowship.size() - 1){
//				System.out.print(", ");
//			}

			if (i != 0){
				System.out.print(", ");
			}
			System.out.print(fellowship.get(i) );


		}

		System.out.println();
		System.out.println();

	}
}
