package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
        String greeting = "Hello, World!";
		System.out.println("greeting: " + greeting);

		int[] scores;
		scores = new int[5];
		scores[0] = 1;
		scores[4] = 5;
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		String name = "Cum    Meister";
        System.out.println("name.length() = "+name.length());
		System.out.println("scores.length = "+scores.length);
		System.out.println();
		System.out.println("charAt("+(name.length() - 1) + ") = " + name.charAt(name.length() - 1));
		int position = name.indexOf('i');
		int anotherPosition = name.indexOf("Cum");
		int i = name.length();
		int j = i / 2;
		System.out.println("name.indexOf('i') = " + name.indexOf('i') );
		System.out.println("name.indexOf(Cum) = " + name.indexOf("Cum") );
		String cum = name.substring(0, 3);
		String meister = name.substring(7, 14);
		String mum = name.substring(j, i);
		String mom = name.substring(0, j);
		System.out.println("name.subString(0, 3); = " + cum);
		System.out.println("name.subString(7, 14); = " + meister);
		System.out.println("name.subString(0, j); = " + mom);
		System.out.println("name.subString(j, i); = " + mum);
		System.out.println("Let's nest a string! " + mom + "H." + mum);
		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
