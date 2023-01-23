package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Decimal to Binary Converter");
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String lineInput = scanner.nextLine();
		String[] inputArray = lineInput.split(" ");
//		int[] intArray = new int[];
		for (int i = 0; i < inputArray.length; i++) {
			int decimalNumber = Integer.parseInt(inputArray[i]);
			long binaryNumber = decimalNumber;
			long remainder = 0;
			if (binaryNumber > 0){
				binaryNumber = decimalNumber / 2;
				remainder %= binaryNumber;

			}
//            if (binaryNumber == )

						System.out.println("Decimal Number: " + decimalNumber);
			            System.out.println("Binary: " + remainder);

		}

		scanner.close();


	}

}
