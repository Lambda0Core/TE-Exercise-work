package com.techelevator;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number (max Fibonacci number): ");
		String limit = scanner.nextLine();

		int maxFibonacci = Integer.parseInt(limit);


// ====================================================
//  THIS EXAMPLE IS INCORRECT
//    IT IS UP TO YOU TO MAKE IT CORRECT
//=====================================================

		int previousValue = 0;
		int currentValue = 1;
		int nextValue = 0;

		System.out.println("0, 1");

		while ((previousValue + currentValue) < maxFibonacci){


			System.out.print("," + previousValue + currentValue + " ");

			nextValue = previousValue + currentValue;
			previousValue = currentValue;
			currentValue = nextValue;

		}
	}

}
