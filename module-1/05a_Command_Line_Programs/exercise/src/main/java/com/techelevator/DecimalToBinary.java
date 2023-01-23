package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Decimal to Binary Converter");
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String lineInput = scanner.nextLine();
		String[] inputArray = lineInput.split(" ");
        String binaryResult = "";
		for (int i = 0; i < inputArray.length; i++) {
			int decimalNumber = Integer.parseInt(inputArray[i]);
			Integer remainder = 0;
			int binaryNumber = decimalNumber;
			while (binaryNumber > 0) {
				remainder = (binaryNumber % 2);
				binaryResult = remainder.toString() + binaryResult;
				binaryNumber = binaryNumber / 2;
			}
//            if (binaryNumber == )

						System.out.println(decimalNumber + " in Binary is " + binaryResult);

		}

		scanner.close();


	}

}
