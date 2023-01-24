package com.techelevator;

import java.math.BigDecimal;

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
		String greeting = "Hello, World!";  // creates a new instance of String
		System.out.println("greeting: " + greeting);

		int[] scores;
		scores = new int[5];
		scores[0] = 1;
		scores[4] = 5;

		System.out.println(scores[0]);

		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		String name = "John Jacob Jingleheimer Schmidt";

		System.out.println("name.length() = " + name.length());
		System.out.println("scores.length = " + scores.length);


		System.out.println("charAt(0) = " + name.charAt(0));
		System.out.println("charAt(" + ( name.length() - 1) + ") = " + name.charAt(name.length() - 1));

		System.out.println("name.indexOf('i') = " + name.indexOf('i'));
		System.out.println("name.indexOf(Ji) = " + name.indexOf("Ji"));

		String myString = "Pure Michigan";
		int position = myString.indexOf('u');
		int anotherPosition = myString.indexOf("Mi");

		System.out.println(position); // 1
		System.out.println(anotherPosition); // 5


		System.out.println("===========  Substring ==============");

		String mySubString = myString.substring(0,6);
		System.out.println(mySubString);
		// output: Pure M

		String s1 = "ALL MEN ARE CREATED EQUAL";
		String s2 = s1.substring(15, 18);

		System.out.println("ALL MEN ARE CREATED EQUAL ->  s1.substring(15, 18) -> " + s2 );

		System.out.println("s1.substring(15) " + s1.substring(15));

		//=== Strings are immutable
		System.out.println("===========  Strings are immutable =========");
		System.out.println(s1);
		System.out.println(s1.substring(15, 18));
		System.out.println(s1);

		String newName = "Tommy";

		newName = "Timmy";

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


		//ends with
		System.out.println("name endswith dt " +  name.endsWith("dt"));

		//starts with
		System.out.println("Name starts with Jo " + name.startsWith("Jo"));

		// indexOf
		//astIndexOf

		System.out.println("indexOf J " + name.indexOf('J'));
		System.out.println("last indexOf J " + name.lastIndexOf('J'));
		System.out.println("find the second indexOf J " + name.indexOf('J', 1));



		//  TRIM
		System.out.println("====TRIM===================");
		String someLongString = "          bobby     ";
		System.out.println("|" + someLongString.trim() + "|");
		System.out.println("|" + someLongString + "|");

		// compare names
		String bigBob = "BOB";
		String littleBob = "bob";

		System.out.println("Compare " + ( bigBob.toLowerCase().equals(littleBob.toLowerCase())));
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
		System.out.println(hello1 + " " + hello3);

		hello3 = "goodbye";
		System.out.println(hello1 + " " + hello3);


		double a = 0.02;
		double b = 0.03;
		double c = b - a;
		System.out.println(c);

		BigDecimal _a = new BigDecimal("0.02");
		BigDecimal _b = new BigDecimal("0.03");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);

	}
}
